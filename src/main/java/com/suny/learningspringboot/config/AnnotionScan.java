package com.suny.learningspringboot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**************************************
 *  Description  使用注解的方法进行扫描bean
 *  @author 孙建荣
 *  @date 17-10-19.下午5:27
 *  @version 1.0
 **************************************/
@ComponentScan(basePackages ="com.suny")
@Configuration
public class AnnotionScan {

}
