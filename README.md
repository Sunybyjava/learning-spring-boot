# Learning-SpringBoot
学习SpringBoot的一些常用的使用方法，以及学习Spring框架的原理分析

## SpringBoot
SpringBoot是一个Spring应用快开发工具，用来简化Spring应用开发过程

### 1. Spring相关
- #### 1.1 Spring自定义初始化Bean的3种方法
    - 1
    - 2
    - 3
- #### 1.2 几种Spring使用注解方式定义Bean
    使用一下几个注解在类上进行声明的话，Spring容器就会自动识别,然后会自动讲POJO转换为容易管理的Bean
    - @Component  
     没有明确的角色的时候使用,如果你不知道被注解的类是什么角色，你就可以直接用这个
    - @Controller  
    用于对Controller实现类进行注解
    - @Service    
    用于对Service实现类进行注解
    - @Repository    
     对于DAO实现类的注解
    - @Mapper   
     MyBatis Mapper接口的注解
- #### 1.4 Spring基于xml的配置bean
     ```xml
      <bean id="填写一个bean的名称" class="类的全限类型"/>
```
- #### 1.5 Spring依赖注入的几种方式
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
