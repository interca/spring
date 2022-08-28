package com.it.service.impl;

import com.it.dao.AccountDao;
import com.it.service.serviceAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceAccountImpl implements serviceAccount {

    @Autowired
    private AccountDao accountDao;
    @Override
    public void money(String name1, String name2, int money) {
          accountDao.inmoney(name1,money);
          accountDao.outmoney(name2,money);
    }
}
