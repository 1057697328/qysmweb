package net.lightwing.mediweb.service;

import net.lightwing.mediweb.dao.MDoctorDao;
import net.lightwing.mediweb.dao.MProjectDao;
import net.lightwing.mediweb.pojo.MDoctor;
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
public class MProjectService {
    @Autowired
    private MProjectDao dao;

    public int count() {
        return dao.count();
    }


    public List<MProject> getList(Integer pageindex, Integer pagesize) {
        pageindex = (pageindex - 1) * pagesize;
        return dao.selectPageInfo(pageindex, pagesize);
    }


    public MProject selectById(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

}

