package com.chinahandler.demo.chinahandlerdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = {"com.chinahandler.demo.chinahandlerdemo.*.mapping"})
public class ChinahandlerdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChinahandlerdemoApplication.class, args);
    }

}
