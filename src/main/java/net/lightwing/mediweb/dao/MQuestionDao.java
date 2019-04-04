package net.lightwing.mediweb.dao;

import net.lightwing.mediweb.pojo.MQuestion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MQuestionDao {
    int deleteByPrimaryKey(Integer qid);

    int insert(MQuestion record);

    int insertSelective(MQuestion record);

    MQuestion selectByPrimaryKey(Integer qid);

    int updateByPrimaryKeySelective(MQuestion record);

    int updateByPrimaryKeyWithBLOBs(MQuestion record);

    int updateByPrimaryKey(MQuestion record);

    int count();

    List<MQuestion> selectPageInfo(@Param("pageindex") Integer pageindex, @Param("pagesize") Integer pagesize);
}