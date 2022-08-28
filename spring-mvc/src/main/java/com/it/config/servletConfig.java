package com.it.config;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * servlet启动的配置类加载mvc
 */
public class servletConfig extends AbstractDispatcherServletInitializer {
    /**
     * 加载mvc容器配置
     * @return
     */


    /**
     * 设置哪些请求归mvc处理
     * @return
     */
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext a=new AnnotationConfigWebApplicationContext();
        //注册配置
        a.register(springmvcConfig.class);
        return a;
    }

    @Override
    protected String[] getServletMappings() {
        //所有请求
        return new String[]{"/"};
    }

    //加载spring容器
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
