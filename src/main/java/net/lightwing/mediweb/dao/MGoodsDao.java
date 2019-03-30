package net.lightwing.mediweb.dao;

import java.util.List;
import net.lightwing.mediweb.pojo.MGoods;
import net.lightwing.mediweb.pojo.MGoodsExample;
import net.lightwing.mediweb.pojo.MGoodtype;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MGoodsDao {
    long countByExample(MGoodsExample example);

    int deleteByExample(MGoodsExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(MGoods record);

    int insertSelective(MGoods record);

    List<MGoods> selectByExample(MGoodsExample example);

    MGoods selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") MGoods record, @Param("example") MGoodsExample example);

    int updateByExample(@Param("record") MGoods record, @Param("example") MGoodsExample example);

    int updateByPrimaryKeySelective(MGoods record);

    int updateByPrimaryKey(MGoods record);

    List<MGoods> selectWithType();

    List<MGoods> getGoods(@Param("gname") String gname);

}