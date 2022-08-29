package com.it.controller;


import com.it.domain.Account;
import com.it.service.AccountService;
import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//控制器类
@Controller
@RestController
@RequestMapping("/account")
public class UserController {

    @RequestMapping("/book")
    public void s(){
        System.out.println("niaho");
    }
    @Autowired
    private AccountService accountService;
    @PostMapping
    public void save(@RequestBody Account account){
        System.out.println(1);
        accountService.save(account);
    }

    @GetMapping
    public List<Account> save2(){
        System.out.println("返回");
        List<Account> all = accountService.findAll();
        System.out.println(all);
        return all;
    }
}
