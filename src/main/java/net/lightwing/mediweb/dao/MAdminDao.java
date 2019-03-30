package net.lightwing.mediweb.dao;

import java.util.List;
import net.lightwing.mediweb.pojo.MAdmin;
import net.lightwing.mediweb.pojo.MAdminExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MAdminDao {
    long countByExample(MAdminExample example);

    int deleteByExample(MAdminExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(MAdmin record);

    int insertSelective(MAdmin record);

    List<MAdmin> selectByExample(MAdminExample example);

    MAdmin selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") MAdmin record, @Param("example") MAdminExample example);

    int updateByExample(@Param("record") MAdmin record, @Param("example") MAdminExample example);

    int updateByPrimaryKeySelective(MAdmin record);

    int updateByPrimaryKey(MAdmin record);
}