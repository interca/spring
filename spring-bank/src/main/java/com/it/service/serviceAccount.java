package com.it.service;

import org.springframework.transaction.annotation.Transactional;

public interface serviceAccount {

    @Transactional
    void money(String name1,String name2,int money);
}
