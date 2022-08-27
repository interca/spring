package com.it.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

//配置数据源信息
public class jdbcConfig {
    @Value("${driver}")
    private String driver;

    @Value("${url}")
    private String url;
    @Value("${name}")
    private String username;

    @Value("${password}")
    private  String password;

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource=new DruidDataSource();
        System.out.println(password);
        System.out.println(url);
        System.out.println(driver);
        System.out.println(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(username);
        dataSource.setUrl(url);
        return dataSource;
    }
}
