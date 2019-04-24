package net.lightwing.qysmweb.dao;

import net.lightwing.qysmweb.pojo.MCoop;
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