package com.wyz.config;

import com.wyz.interceptors.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor  loginInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //WebMvcConfigurer.super.addInterceptors(registry);

        // 登录和注册不拦截
        registry.addInterceptor(loginInterceptor).excludePathPatterns("/user/login",
                "/user/register",
                "/product/show",
                "/product/tbsearch",
                "/product/jdsearch",
                "/product/add",
                "/product/readmysql",
                "/product/deletemysql",
                "/product/getcertain");
    }
}



