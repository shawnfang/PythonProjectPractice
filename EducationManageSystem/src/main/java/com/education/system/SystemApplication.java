package com.education.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 需要通过MapperScan把所有的mapper引入，另外一种方式就是每个Mapper前加一个@Mapper的注解
 */
@SpringBootApplication
@MapperScan(value = "com.education.system.mapper")
public class SystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }

}
