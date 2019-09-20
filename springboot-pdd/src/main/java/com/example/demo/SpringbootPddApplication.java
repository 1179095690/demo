package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@EnableAutoConfiguration
@Configuration
@ComponentScan("com.pdd")
@MapperScan("com.pdd.dao")
@SpringBootApplication
public class SpringbootPddApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPddApplication.class, args);
	}

}
