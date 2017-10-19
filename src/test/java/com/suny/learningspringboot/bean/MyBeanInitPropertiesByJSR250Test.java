package com.suny.learningspringboot.bean;

import com.suny.learningspringboot.config.MyConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**************************************
 *  Description  
 *  @author 孙建荣
 *  @date 17-10-19.下午4:13
 *  @version 1.0
 **************************************/
public class MyBeanInitPropertiesByJSR250Test {

    @Test
    public void testBean(){
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("直接用bean名字获取================="+applicationContext.getBean("MyBeanInitPropertiesByJSR250"));
        System.out.println("测试使用类型获取===================="+applicationContext.getBean(MyBeanInitPropertiesByJSR250.class));
        applicationContext.close();
    }


}