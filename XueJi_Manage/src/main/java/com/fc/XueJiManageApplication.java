package com.fc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fc.dao")
public class XueJiManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(XueJiManageApplication.class, args);
    }

}
