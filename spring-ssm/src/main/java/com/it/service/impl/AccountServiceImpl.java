package com.it.service.impl;

import com.it.domain.Account;
import com.it.mapper.AccountMapper;
import com.it.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public void save(Account account) {
         accountMapper.save(account);
    }

    @Override
    public List<Account> findAll() {

        return accountMapper.findAll();
    }
}
