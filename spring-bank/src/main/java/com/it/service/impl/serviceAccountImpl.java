package com.it.service.impl;

import com.it.dao.AccountDao;
import com.it.domain.Account;
import com.it.service.serviceAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class serviceAccountImpl implements serviceAccount {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void money(String name1, String name2, int money) {

          accountDao.inmoney(new Account(name1,money));
         // int i=1/2;
          accountDao.outmoney(new Account(name2,money));
    }
}
