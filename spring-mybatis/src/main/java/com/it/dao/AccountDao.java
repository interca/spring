package com.it.dao;

import com.it.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

public interface AccountDao {
    @Select("select * from account")
    List<Account> findAll();
}
