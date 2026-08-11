package com.java.MyPass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class MyPassApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPassApplication.class, args);
	}

}
