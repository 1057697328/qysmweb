package net.lightwing.qysmweb.service;

import net.lightwing.qysmweb.dao.MGoodsDao;
import net.lightwing.qysmweb.pojo.MGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings("ALL")
@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
public class MGoodsService
{
    @Autowired
    private MGoodsDao dao;

    public List<MGoods> getList()
    {
        return dao.selectWithType();
    }

    public List<MGoods> getGoods(String gname)
    {
        return dao.getGoods(gname);
    }

    public MGoods getGoods(Integer gid)
    {
        return dao.selectByPrimaryKey(gid);
    }

}
