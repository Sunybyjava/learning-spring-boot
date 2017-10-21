# Learning-SpringBoot
学习SpringBoot的一些常用的使用方法，以及学习Spring框架的原理分析

## SpringBoot
SpringBoot是一个Spring应用快开发工具，用来简化Spring应用开发过程

### 1. Spring相关
- #### 1.1 Spring自定义初始化Bean的3种方法
    - 1 使用JSR250规范,在方法上加注解,初始化执行的方法加`@PostConstruct`注解,销毁时执行的方法加注解` @PreDestroy`。
    - 2 Bean类继承`InitializingBean`跟`DisposableBean`接口重载对应接口中的方法
    - 3 在定义bean的时候指定`initMethod`属性跟`destroyMethod`属性
- #### 1.2 Spring注解方式定义Bean
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
     
- #### 1.3 Spring注解方式进行依赖注入
    - @Autowired  【Spring自带的注解,自动从spring的上下文找到合适的bean来注入,优先按类型注入】
    - @Qualifier  【指定要取的bean,跟`@Autowired`注解方式联合使用】
    - @Resource  【JSR250的注解,指定名称注入,优先按名称进行注入】
    - @Primary   【多个bean的时候优先取这个bean】
    - @Inject    【Java EE 6 规范 JSR 330 -- Dependency Injection for Java】  
    
        首先需要添加jar包才可以使用这个注解
        ````xml
            <!-- https://mvnrepository.com/artifact/javax.inject/javax.inject -->
            <dependency>
                <groupId>javax.inject</groupId>
                <artifactId>javax.inject</artifactId>
                <version>1</version>
            </dependency>
        ````
----


### 
