package net.lightwing.mediweb.service;

import net.lightwing.mediweb.dao.MGoodtypeDao;
import net.lightwing.mediweb.pojo.MGoodtype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings("ALL")
@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
public class MGoodtypeService
{
    @Autowired
    private MGoodtypeDao dao;

    public List<MGoodtype> getList()
    {
        return dao.selectByExample(null);
    }
}
