package net.lightwing.qysmweb.service;

import net.lightwing.qysmweb.dao.MQuestionDao;
import net.lightwing.qysmweb.pojo.MQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings("ALL")
@Service
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, noRollbackFor = RuntimeException.class)
public class MQuestionService {
    @Autowired
    private MQuestionDao dao;

    public int count() {
        return dao.count();
    }


    public List<MQuestion> getList(Integer pageindex, Integer pagesize) {
        pageindex = (pageindex - 1) * pagesize;
        return dao.selectPageInfo(pageindex, pagesize);
    }


    public MQuestion selectById(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

}

