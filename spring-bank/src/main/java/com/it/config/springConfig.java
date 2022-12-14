package com.it.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//代替文件成为配置类
@Configuration
@ComponentScan({"com.it"})//扫描的地方
@PropertySources({@PropertySource("classpath:jdbc.properties")})//加载外部文件
@Import({jdbcConfig.class,mybatisConfig.class})//导入其他配置
@EnableTransactionManagement //告诉用注解配置事务
public class springConfig {

}
