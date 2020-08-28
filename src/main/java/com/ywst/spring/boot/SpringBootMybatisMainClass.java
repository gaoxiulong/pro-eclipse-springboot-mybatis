package com.ywst.spring.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//指定Mapper接口所在的包
@MapperScan(basePackages = "com.ywst.spring.boot.mapper")
@SpringBootApplication
public class SpringBootMybatisMainClass {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootMybatisMainClass.class, args);
	}
}
