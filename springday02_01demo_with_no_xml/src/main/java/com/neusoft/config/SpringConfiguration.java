package com.neusoft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author lbf
 * @date 2020/9/7 8:55
 */
//spring全注解配置
    //1.ComponentScan作用：指定spring创建容器时要扫的包
    //属性:value 他和basePackages 一样，
    //等价于xml中配置    // <context:component-scan base-package="com.neusoft">
                       //    </context:component-scan>
    //2.Bean
    //作用：把当前方法的返回值作为Bean对象存入spring的ioc容器中
    //属性：name 指定bean的id 不写时，默认当前方法名
    //细节：当我们使用注解配置时，如果方法有参数，spring框架去容器中查找有没有可用的bean对象，
    //查找的方式和Auto注释作用时一样的
    //3.Import 导入配置类
    //属性：配置类的字节码文件
    //当我们使用@Import注解的类就是（springConfiguration）就是父类配置，而导入的都是子类配置类（JdbcConfig）

    //4.PropertySource
    //指定Properties 文件的位置
    //属性： 文件的名称和路径 classpath表示类路径

//@ComponentScan(basePackages = "com.neusoft")
//@ComponentScan({"com.neusoft"})  //扫入的包为数组类型 如果只有一个包 则可以省略{}
@ComponentScan("com.neusoft")
@Import(JdbcConfig.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration {
}
