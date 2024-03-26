package com.wolfecodes.wintech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class WintechApplication {

	public static void main(String[] args) {
		SpringApplication.run(WintechApplication.class, args);
	}

}
