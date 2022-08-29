package com.it.config;

import org.springframework.context.annotation.*;

//代替文件成为配置类
@Configuration
@ComponentScan({"com.it.domain","com.it.mapper","com.it.service","com.it.controller"})//扫描的地方
@PropertySources({@PropertySource("classpath:jdbc.properties")})//加载外部文件
@Import({jdbcConfig.class,mybatisConfig.class})//导入其他配置
public class springConfig {

}
