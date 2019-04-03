package net.lightwing.mediweb.service;

import net.lightwing.mediweb.dao.MInductryDao;
import net.lightwing.mediweb.dao.MInductryinfoDao;
import net.lightwing.mediweb.pojo.MInductry;
import net.lightwing.mediweb.pojo.MInductryinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings("ALL")
@Service
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, noRollbackFor = RuntimeException.class)
public class MInductryInfoService {
    @Autowired
    private MInductryinfoDao dao;

    public int count() {
        return dao.count();
    }


    public List<MInductryinfo> getList(Integer pageindex, Integer pagesize) {
        pageindex = (pageindex - 1) * pagesize;
        return dao.selectPageInfo(pageindex, pagesize);
    }


    public List<MInductryinfo> selectByIid(Integer iid) {
        return dao.selectByPrimaryKey(iid);
    }

    public MInductryinfo selectByIiid(Integer iiid) {
        return dao.selectById(iiid);
    }

}

