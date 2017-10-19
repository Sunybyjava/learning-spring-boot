package com.suny.learningspringboot.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**************************************
 *  Description  定义继承Spring>InitializingBean，DisposableBean的bean，然后执行初始化跟销毁后的行为
 *  @author 孙建荣
 *  @date 17-10-19.下午4:06
 *  @version 1.0
 **************************************/
public class MyBeanInitPropertiesByInitializingBean implements InitializingBean, DisposableBean {

    @Override
    public void destroy() {
        System.out.println("测试销毁方法 by implements DisposableBean ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("测试初始化 by implements InitializingBean ");
    }
}
