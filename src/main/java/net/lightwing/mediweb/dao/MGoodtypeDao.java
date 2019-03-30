package net.lightwing.mediweb.dao;

import java.util.List;
import net.lightwing.mediweb.pojo.MGoodtype;
import net.lightwing.mediweb.pojo.MGoodtypeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MGoodtypeDao {
    long countByExample(MGoodtypeExample example);

    int deleteByExample(MGoodtypeExample example);

    int deleteByPrimaryKey(Integer gtypeid);

    int insert(MGoodtype record);

    int insertSelective(MGoodtype record);

    List<MGoodtype> selectByExample(MGoodtypeExample example);

    MGoodtype selectByPrimaryKey(Integer gtypeid);

    int updateByExampleSelective(@Param("record") MGoodtype record, @Param("example") MGoodtypeExample example);

    int updateByExample(@Param("record") MGoodtype record, @Param("example") MGoodtypeExample example);

    int updateByPrimaryKeySelective(MGoodtype record);

    int updateByPrimaryKey(MGoodtype record);
}