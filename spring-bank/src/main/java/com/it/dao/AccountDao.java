package com.it.dao;

import com.it.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AccountDao {
   // @Update("update account set money=money+#{money} where name=#{name}")
    void inmoney(Account account);

   // @Update("update account set money=money-#{money} where name=#{name}")
    void outmoney(Account account);
}
