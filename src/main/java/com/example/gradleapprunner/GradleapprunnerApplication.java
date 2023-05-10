package com.example.gradleapprunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GradleapprunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleapprunnerApplication.class, args);
	}

}
