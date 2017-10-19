package com.suny.learningspringboot.bean;

import com.suny.learningspringboot.config.MyConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**************************************
 *  Description  
 *  @author 孙建荣
 *  @date 17-10-19.下午3:15
 *  @version 1.0
 **************************************/
public class MyBeanTest {

    @Test
    public void testBean(){
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println(applicationContext.getBean("myBean"));
        System.out.println(applicationContext.getBean(MyBean.class));
        applicationContext.close();
    }

}