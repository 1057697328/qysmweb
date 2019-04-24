package net.lightwing.qysmweb.dao;

import java.util.List;
import net.lightwing.qysmweb.pojo.MConfig;
import net.lightwing.qysmweb.pojo.MConfigExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MConfigDao {
    long countByExample(MConfigExample example);

    int deleteByExample(MConfigExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(MConfig record);

    int insertSelective(MConfig record);

    List<MConfig> selectByExampleWithBLOBs(MConfigExample example);

    List<MConfig> selectByExample(MConfigExample example);

    MConfig selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") MConfig record, @Param("example") MConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") MConfig record, @Param("example") MConfigExample example);

    int updateByExample(@Param("record") MConfig record, @Param("example") MConfigExample example);

    int updateByPrimaryKeySelective(MConfig record);

    int updateByPrimaryKeyWithBLOBs(MConfig record);

    int updateByPrimaryKey(MConfig record);
}