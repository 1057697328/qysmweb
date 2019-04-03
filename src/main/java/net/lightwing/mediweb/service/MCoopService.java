package net.lightwing.mediweb.service;

import net.lightwing.mediweb.dao.MCoopDao;
import net.lightwing.mediweb.dao.MProjectDao;
import net.lightwing.mediweb.pojo.MCoop;
import net.lightwing.mediweb.pojo.MProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings("ALL")
@Service
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, noRollbackFor = RuntimeException.class)
public class MCoopService {
    @Autowired
    private MCoopDao dao;

    public int count() {
        return dao.count();
    }


    public List<MCoop> getList(Integer pageindex, Integer pagesize) {
        pageindex = (pageindex - 1) * pagesize;
        return dao.selectPageInfo(pageindex, pagesize);
    }


    public MCoop selectById(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

}

