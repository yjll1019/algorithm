package com.mandalart_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})//db설정시 지워야
public class MandalartServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MandalartServerApplication.class, args);
	}

}
