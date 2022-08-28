package com.it.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//控制器类
@RestController
public class UserController {

    @RequestMapping("/save")
    public String save(){
        return "hello";
    }

}
