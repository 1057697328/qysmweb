package net.lightwing.mediweb.dao;

import java.util.List;
import net.lightwing.mediweb.pojo.MContact;
import net.lightwing.mediweb.pojo.MContactExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MContactDao {
    long countByExample(MContactExample example);

    int deleteByExample(MContactExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(MContact record);

    int insertSelective(MContact record);

    List<MContact> selectByExample(MContactExample example);

    MContact selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") MContact record, @Param("example") MContactExample example);

    int updateByExample(@Param("record") MContact record, @Param("example") MContactExample example);

    int updateByPrimaryKeySelective(MContact record);

    int updateByPrimaryKey(MContact record);
}