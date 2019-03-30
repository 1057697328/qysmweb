package net.lightwing.mediweb.service;

import net.lightwing.mediweb.dao.MBannerDao;
import net.lightwing.mediweb.pojo.MBanner;
import net.lightwing.mediweb.pojo.MBannerExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings("ALL")
@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,rollbackFor = Exception.class,noRollbackFor = RuntimeException.class)
public class MBannerService
{
    @Autowired
    private MBannerDao dao;

    public List<MBanner> getList(Integer pageindex,Integer pagesize)
    {
        pageindex=(pageindex-1)*pagesize;
        MBannerExample example = new MBannerExample();
        example.setOffset(Long.valueOf(pageindex));
        example.setLimit(pagesize);
        return dao.selectByExample(example);
    }
}
