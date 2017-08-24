package com.gen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gen.dao")
public class GenApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenApplication.class, args);
	}
}
