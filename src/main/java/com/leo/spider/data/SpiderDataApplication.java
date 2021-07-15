package com.leo.spider.data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.leo.spider.data.dao")
@SpringBootApplication
public class SpiderDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpiderDataApplication.class, args);
    }

}
