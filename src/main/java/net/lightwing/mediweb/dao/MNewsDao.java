package net.lightwing.mediweb.dao;

import java.util.List;
import net.lightwing.mediweb.pojo.MNews;
import net.lightwing.mediweb.pojo.MNewsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MNewsDao {
    long countByExample(MNewsExample example);

    int deleteByExample(MNewsExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(MNews record);

    int insertSelective(MNews record);

    List<MNews> selectByExampleWithBLOBs(MNewsExample example);

    List<MNews> selectByExample(MNewsExample example);

    MNews selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") MNews record, @Param("example") MNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") MNews record, @Param("example") MNewsExample example);

    int updateByExample(@Param("record") MNews record, @Param("example") MNewsExample example);

    int updateByPrimaryKeySelective(MNews record);

    int updateByPrimaryKeyWithBLOBs(MNews record);

    int updateByPrimaryKey(MNews record);

    List<MNews> selectWithType(@Param("pageindex") Integer pageindex,@Param("pagesize") Integer pagesize);

    MNews selectWithTypeSingle(@Param("nid") Integer nid);
}