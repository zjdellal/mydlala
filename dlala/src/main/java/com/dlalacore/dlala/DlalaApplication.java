package com.dlalacore.dlala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@SpringBootApplication(scanBasePackages={
"com.spring.beans"})
public class DlalaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DlalaApplication.class, args);
	}

}
