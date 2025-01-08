# 自定义spring-boot-starter
## 模块说明

| 模块                             | 说明              |
|--------------------------------|-----------------|
| demo-spring-boot-autoconfigure | 配置类的autoconfigure |
| demo-spring-boot-starter       | 主要是依赖管理         |


## 注意事项
1、spring-boot 3.x之后，自动配置不再使用spring.factories里面的配置了改成了使用:META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports 文件里面的配置； <br/>
2、不能使用 spring-boot的 maven plugin，因为会检查main类；

## 例子
[mybatis-spring-boot-starter](https://github.com/mybatis/spring-boot-starter/tree/master)

## 参考
[Spring Creating Your Own Starter
](https://docs.spring.io/spring-boot/docs/2.1.6.RELEASE/reference/html/boot-features-developing-auto-configuration.html#boot-features-custom-starter)

[编写一个自己的SpringBoot Starter
](https://www.cnblogs.com/mingshan/p/17793496.html)