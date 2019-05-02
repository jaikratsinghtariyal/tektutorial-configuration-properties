package com.tektutorial.spring.application.tektutorialconfigurationproperties.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tektutorial.spring.application.tektutorialconfigurationproperties.bean.MyBean;

@Configuration
public class ApplicationConfig {

	
	@ConfigurationProperties(prefix = "another")
	@Bean
	public MyBean getMyBean() {
		return new MyBean();
	}
	
}
