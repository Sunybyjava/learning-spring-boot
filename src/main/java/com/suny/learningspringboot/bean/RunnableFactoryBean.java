package com.suny.learningspringboot.bean;

import org.springframework.beans.factory.FactoryBean;

/**************************************
 *  Description  
 *  @author 孙建荣
 *  @date 17-10-19.下午3:22
 *  @version 1.0
 **************************************/
public class RunnableFactoryBean implements FactoryBean<Runnable> {
    @Override
    public Runnable getObject() throws Exception {
        return () -> {
        };
    }

    @Override
    public Class<?> getObjectType() {
        return Runnable.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
