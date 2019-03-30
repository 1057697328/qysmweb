package net.lightwing.mediweb.service;

import net.lightwing.mediweb.dao.MContactDao;
import net.lightwing.mediweb.pojo.MContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : clarence
 * 创建时间 : 2019-03-23
 * 长沙轻翼网络科技有限公司
 */
@SuppressWarnings("ALL")
@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,rollbackFor = Exception.class,noRollbackFor = RuntimeException.class)
public class MContactService
{
    @Autowired
    private MContactDao dao;


    public void addContact(MContact contact)
    {
        dao.insertSelective(contact);
    }
}
