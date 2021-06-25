package com.glii.glbackmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.glii.glbackmanage.mapper")
public class GlBackManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlBackManageApplication.class, args);
    }

}
