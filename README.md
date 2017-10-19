# Learning-SpringBoot
学习SpringBoot的一些常用的使用方法，以及学习Spring框架的原理分析

## 学习SpringBoot

### 1. Spring相关
- #### 1.1 Spring初始化Bean的3种方法
    - 1
    - 2
    - 3
- #### 1.2 Spring在Bean上的常用注解  
    - @Controller
    - @Service
    - @Component  没有明确的角色的时候使用
    - @Repository
    - Mapper
- #### 1.3 Spring依赖注入的几种方式
    - @Autowired  Spring自带的注解
    - @Qualifier  指定要取的bean
    - @Primary   多个bean的时候优先取这个bean
    - @Resource  JSR250的注解  Java自带的注解
    - @Inject    Java EE 6 规范 JSR 330 -- Dependency Injection for Java
        首先需要添加jar包才可以使用这个注解
        ````xml
            <!-- https://mvnrepository.com/artifact/javax.inject/javax.inject -->
            <dependency>
                <groupId>javax.inject</groupId>
                <artifactId>javax.inject</artifactId>
                <version>1</version>
            </dependency>
        ````
- #### 1.4 Spring扫描bean的方式



----


### Spring初始化Bean的3种方法
