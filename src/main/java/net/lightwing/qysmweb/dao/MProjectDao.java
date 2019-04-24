package net.lightwing.qysmweb.dao;

import net.lightwing.qysmweb.pojo.MProject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface MProjectDao {
    int deleteByPrimaryKey(Integer pid);

    int insert(MProject record);

    int insertSelective(MProject record);

    MProject selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(MProject record);

    int updateByPrimaryKeyWithBLOBs(MProject record);

    int updateByPrimaryKey(MProject record);

    int count();

    List<MProject> selectPageInfo(@Param("pageindex") Integer pageindex, @Param("pagesize") Integer pagesize);

}