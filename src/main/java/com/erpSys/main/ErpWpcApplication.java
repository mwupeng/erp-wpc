package com.erpSys.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.erpSys.main.*" })
public class ErpWpcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpWpcApplication.class, args);
	}

}
