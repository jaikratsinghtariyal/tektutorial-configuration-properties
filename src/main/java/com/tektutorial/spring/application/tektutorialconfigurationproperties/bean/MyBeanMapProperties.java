package com.tektutorial.spring.application.tektutorialconfigurationproperties.bean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("mymapprop")
public class MyBeanMapProperties {

	private final Map<String, MyBean> beanMap = new HashMap<>();

	public Map<String, MyBean> getBeanMap() {
		return beanMap;
	}
}