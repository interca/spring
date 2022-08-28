package com.it.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//做一个配置类
@Configuration
@ComponentScan("com.it.controller")//扫描bean
public class springmvcConfig {

}
