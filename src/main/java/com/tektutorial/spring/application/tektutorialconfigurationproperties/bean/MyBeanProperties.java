package com.tektutorial.spring.application.tektutorialconfigurationproperties.bean;

import java.util.ArrayList;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("myprop")
public class MyBeanProperties {

	private final java.util.List<MyBean> list = new ArrayList<MyBean>();

	public java.util.List<MyBean> getList() {
		return list;
	}
}