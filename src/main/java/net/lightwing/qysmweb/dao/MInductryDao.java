package net.lightwing.qysmweb.dao;

import net.lightwing.qysmweb.pojo.MInductry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MInductryDao {
    int deleteByPrimaryKey(Integer iid);

    int insert(MInductry record);

    int insertSelective(MInductry record);

    MInductry selectByPrimaryKey(Integer iid);

    int updateByPrimaryKeySelective(MInductry record);

    int updateByPrimaryKey(MInductry record);

    int count();

    List<MInductry> selectPageInfo(@Param("pageindex") Integer pageindex, @Param("pagesize") Integer pagesize);

}