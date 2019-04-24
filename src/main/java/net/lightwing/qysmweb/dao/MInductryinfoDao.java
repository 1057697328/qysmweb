package net.lightwing.qysmweb.dao;

import net.lightwing.qysmweb.pojo.MInductryinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MInductryinfoDao {
    int deleteByPrimaryKey(Integer iiid);

    int insert(MInductryinfo record);

    int insertSelective(MInductryinfo record);

    List<MInductryinfo> selectByPrimaryKey(Integer iid);

    int updateByPrimaryKeySelective(MInductryinfo record);

    int updateByPrimaryKeyWithBLOBs(MInductryinfo record);

    int updateByPrimaryKey(MInductryinfo record);

    int count();

    List<MInductryinfo> selectPageInfo(@Param("pageindex") Integer pageindex, @Param("pagesize") Integer pagesize);


    MInductryinfo selectById(Integer iiid);
}