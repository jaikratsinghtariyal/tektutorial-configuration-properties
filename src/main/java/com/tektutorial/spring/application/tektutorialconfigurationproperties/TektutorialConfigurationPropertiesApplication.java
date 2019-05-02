package com.tektutorial.spring.application.tektutorialconfigurationproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tektutorial.*")
public class TektutorialConfigurationPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TektutorialConfigurationPropertiesApplication.class, args);
	}

}
