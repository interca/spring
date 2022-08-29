package com.it.mapper;

import com.it.domain.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {
    public  void save(Account account);

    public List<Account> findAll();
}
