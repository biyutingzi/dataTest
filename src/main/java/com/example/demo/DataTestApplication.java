package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan(basePackages="com.example.demo.dao")
@Configuration
public class DataTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataTestApplication.class, args);
	}

}
