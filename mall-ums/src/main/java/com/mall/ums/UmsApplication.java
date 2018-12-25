package com.mall.ums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("dubbo-config.xml")
public class UmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UmsApplication.class, args);
    }

}

