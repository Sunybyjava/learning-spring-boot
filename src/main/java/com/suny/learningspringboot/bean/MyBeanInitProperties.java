package com.suny.learningspringboot.bean;

/**************************************
 *  Description  定义一个普通的bean
 *  @author 孙建荣
 *  @date 17-10-19.下午4:06
 *  @version 1.0
 **************************************/
public class MyBeanInitProperties {

    public void init() {
        System.out.println("测试初始化 by @Bean(initMethod = \"init\" )");
    }

    public void destroy() {
        System.out.println("测试销毁方法 by @Bean(destroyMethod = \"destroy\" )");
    }
}
