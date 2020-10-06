package com.bjsxt.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bjsxt.mapper")// 指定扫描 Mapper 的包
public class ProviderApplication {
    public static void main(String[] args) {
    SpringApplication.run(ProviderApplication.class, args);
    }
}