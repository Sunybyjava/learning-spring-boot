package com.suny.learningspringboot.config;

import com.suny.learningspringboot.bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


/**************************************
 *  Description   Spring注解配置类
 *  @author 孙建荣
 *  @date 17-10-19.下午2:46
 *  @version 1.0
 **************************************/
@Configuration
public class MyConfig {

    @Bean
    public MyBeanInitPropertiesByInitializingBean MyBeanInitPropertiesByInitializingBean() {
        return new MyBeanInitPropertiesByInitializingBean();
    }

    @Bean
    public MyBeanInitPropertiesByJSR250 MyBeanInitPropertiesByJSR250() {
        return new MyBeanInitPropertiesByJSR250();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public MyBeanInitProperties getMyBeanInitProperties() {
        return new MyBeanInitProperties();
    }

    @Bean(name = "myBean")
    @Scope("prototype")
    public MyBean createMyBean() {
        return new MyBean();
    }

    @Bean(name = "runnableFactoryBean")
    public RunnableFactoryBean createRunnableFactoryBean() {
        return new RunnableFactoryBean();
    }
}
