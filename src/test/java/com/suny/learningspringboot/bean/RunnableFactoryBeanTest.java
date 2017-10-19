package com.suny.learningspringboot.bean;

import com.suny.learningspringboot.config.MyConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**************************************
 *  Description  
 *  @author 孙建荣
 *  @date 17-10-19.下午3:25
 *  @version 1.0
 **************************************/
public class RunnableFactoryBeanTest {

    @Test
    public void testBean(){
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("直接用bean名字获取================="+applicationContext.getBean("runnableFactoryBean"));
        System.out.println("获取RunnableFactoryBean实例========"+applicationContext.getBean("&runnableFactoryBean"));
        System.out.println("测试使用类型获取===================="+applicationContext.getBean(Runnable.class));
        applicationContext.close();
    }
}