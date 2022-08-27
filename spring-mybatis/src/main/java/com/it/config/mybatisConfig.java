package com.it.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.SQLException;

public class mybatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws SQLException {
        SqlSessionFactoryBean s=new SqlSessionFactoryBean();
        //s.setTypeAliasesPackage("com.it.domain");
        //设置数据源对象
        s.setDataSource(dataSource);
        return s;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
      MapperScannerConfigurer msc=new MapperScannerConfigurer();
      //映射在哪个包
        msc.setBasePackage("com/it/dao");
      return msc;
    }


}
