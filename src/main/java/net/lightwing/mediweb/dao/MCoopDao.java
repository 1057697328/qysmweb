package net.lightwing.mediweb.dao;

import net.lightwing.mediweb.pojo.MCoop;
import net.lightwing.mediweb.pojo.MProject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MCoopDao {
    int deleteByPrimaryKey(Integer coid);

    int insert(MCoop record);

    int insertSelective(MCoop record);

    MCoop selectByPrimaryKey(Integer coid);

    int updateByPrimaryKeySelective(MCoop record);

    int updateByPrimaryKey(MCoop record);

    int count();

    List<MCoop> selectPageInfo(@Param("pageindex") Integer pageindex, @Param("pagesize") Integer pagesize);

}