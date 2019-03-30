package net.lightwing.mediweb.service;

import net.lightwing.mediweb.dao.MNewsDao;
import net.lightwing.mediweb.pojo.MNews;
import net.lightwing.mediweb.pojo.MNewsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings("ALL")
@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,rollbackFor = Exception.class,noRollbackFor = RuntimeException.class)
public class MNewsService
{
    @Autowired
    private MNewsDao dao;

    public List<MNews> getList(Integer pageindex,Integer pagesize)
    {
        pageindex=(pageindex-1)*pagesize;
        MNewsExample example = new MNewsExample();
        example.setOffset(Long.valueOf(pageindex));
        example.setLimit(pagesize);
        return dao.selectWithType(pageindex, pagesize);
    }

    public Integer getCount()
    {
        return (int)dao.countByExample(null);
    }

    public MNews getNews(Integer nid)
    {
        return dao.selectWithTypeSingle(nid);
    }
}
