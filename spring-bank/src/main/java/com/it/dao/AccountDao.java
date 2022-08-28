package com.it.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface AccountDao {
    @Update("update account set money=money+${money}where name=${name}")
    void inmoney(@Param("name") String name, @Param("money") int  money);

    @Update("update account set money=money-${money}where name=${name}")
    void outmoney(@Param("name") String name, @Param("money") int  money);
}
