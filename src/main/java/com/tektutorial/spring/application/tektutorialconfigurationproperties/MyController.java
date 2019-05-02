package com.tektutorial.spring.application.tektutorialconfigurationproperties;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tektutorial.spring.application.tektutorialconfigurationproperties.bean.MyBean;
import com.tektutorial.spring.application.tektutorialconfigurationproperties.bean.MyBeanMapProperties;
import com.tektutorial.spring.application.tektutorialconfigurationproperties.bean.MyBeanProperties;
import com.tektutorial.spring.application.tektutorialconfigurationproperties.config.ApplicationConfig;
import com.tektutorial.spring.application.tektutorialconfigurationproperties.config.DatabaseConfig;

@RestController
@RequestMapping("/api")
public class MyController {

	@Autowired
	private DatabaseConfig databaseConfig;
	
	@Autowired
	private MyBean myBean;
	
	@Autowired
	private MyBeanProperties myBeanProperties;
	
	
	@Autowired
	private MyBeanMapProperties myBeanMapProperties; 
	
	@GetMapping("/my-bean-map-properties")
	public String getMyBeanMapProperties() {
		MyBean bean = myBeanMapProperties.getBeanMap().get("key1");
		
		String values = "Value1:-" + bean.getValue1()
				+ ", Value2 - " + bean.getValue1();
		
		return "Hello- " + values;
	}
	
	@GetMapping("/my-bean-properties")
	public String getMyBeanProperties() {
		MyBean bean = myBeanProperties.getList().get(1);
		String values = "Value1:-" + bean.getValue1()
				+ ", Value2 - " + bean.getValue1();
		
		return "Hello- " + values;
	}
	
	
	@GetMapping("/app-config")
	public String getApplicationConfig() {
		String values = "Value1:-" + myBean.getValue1()
				+ ", Value2 - " + myBean.getValue1();
		
		return "Hello- " + values;
	}
	
	@GetMapping("/data-config")
	public String getMethod() {
		String values = "ClassName:-" + databaseConfig.getClassName()
				+ ", Database - " 
				+ databaseConfig.getDb()
				+ ", Port: - " 
				+ databaseConfig.getPort()
				+ ", User Name: - " 
				+ databaseConfig.getUserName()
				+ ", Password: - " 
				+ databaseConfig.getPassword();
		
		return "Hello- " + values;
	}
}