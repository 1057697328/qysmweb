package net.lightwing.qysmweb.service;

import net.lightwing.qysmweb.dao.MDoctorDao;
import net.lightwing.qysmweb.pojo.MDoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings("ALL")
@Service
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, noRollbackFor = RuntimeException.class)
public class MDoctorService {
    @Autowired
    private MDoctorDao dao;

    public int count() {
        return dao.count();
    }


    public List<MDoctor> getList(Integer pageindex, Integer pagesize) {
        pageindex = (pageindex - 1) * pagesize;
        return dao.selectWithType(pageindex, pagesize);
    }

    public MDoctor selectByName(String name) {
        return dao.selectByName(name);
    }

    public MDoctor selectById(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

}

