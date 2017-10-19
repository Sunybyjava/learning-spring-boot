package com.suny.learningspringboot.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**************************************
 *  Description  使用JSR250规范注解进行Bean的初始化
 *  @author 孙建荣
 *  @date 17-10-19.下午4:06
 *  @version 1.0
 **************************************/
public class MyBeanInitPropertiesByJSR250 {

    @PostConstruct
    public void init() {
        System.out.println("测试初始化ByJSR250");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("测试销毁方法ByJSR250");
    }
}
