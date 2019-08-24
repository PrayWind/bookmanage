package com.xmut.bookmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

// @ServletComponentScan：有这个注解就不用@MapperScan，只需在每个Mapper文件加上@Mapper注解就行
@SpringBootApplication
@ServletComponentScan
//@MapperScan("com.xmut.bookmanage.module.**")
public class BookmanageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookmanageServiceApplication.class, args);
    }

}
