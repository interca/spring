package com.it.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface logService {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public  void log(String name1,String name2,int money);
}
