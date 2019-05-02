package com.tektutorial.spring.application.tektutorialconfigurationproperties.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "db")
public class DatabaseConfig {
	
	private String className;
	private String name;
	private int port;
	private String userName;
	private String password;
	
	
	public String getClassName() {
		return className;
	}
	public String getDb() {
		return name;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPort() {
		return port;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
}
