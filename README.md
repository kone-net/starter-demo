Springboot Starter的例子


在pom文件中的构建插件中，需要添加<skip>true</skip>，否则包不能够被其他项目导入。
```xml
<plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
    <configuration>
        <skip>true</skip>
    </configuration>
</plugin>
```