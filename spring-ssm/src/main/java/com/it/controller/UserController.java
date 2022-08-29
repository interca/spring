package com.it.controller;


import com.it.domain.Account;
import com.it.service.AccountService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//控制器类
@RestController
public class UserController {

    @Autowired
    private AccountService accountService;
    @PostMapping
    public void save(@RequestBody Account account){
        accountService.save(account);
    }

    @GetMapping
    public List<Account> save2(){
        return  accountService.findAll();
    }
}
