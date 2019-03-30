package net.lightwing.mediweb.dao;

import java.util.List;
import net.lightwing.mediweb.pojo.MNewstype;
import net.lightwing.mediweb.pojo.MNewstypeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MNewstypeDao {
    long countByExample(MNewstypeExample example);

    int deleteByExample(MNewstypeExample example);

    int deleteByPrimaryKey(Integer ntypeid);

    int insert(MNewstype record);

    int insertSelective(MNewstype record);

    List<MNewstype> selectByExample(MNewstypeExample example);

    MNewstype selectByPrimaryKey(Integer ntypeid);

    int updateByExampleSelective(@Param("record") MNewstype record, @Param("example") MNewstypeExample example);

    int updateByExample(@Param("record") MNewstype record, @Param("example") MNewstypeExample example);

    int updateByPrimaryKeySelective(MNewstype record);

    int updateByPrimaryKey(MNewstype record);
}