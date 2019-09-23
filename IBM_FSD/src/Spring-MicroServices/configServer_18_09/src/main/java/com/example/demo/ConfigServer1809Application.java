package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class ConfigServer1809Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServer1809Application.class, args);
	}

}
