package com.ssi.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.ssi")
public class ProjectConfig {

	
	
	@Bean
	public InternalResourceViewResolver viewResolver(){
		
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setSuffix(".jsp");
		vr.setPrefix("/WEB-INF/views/");
		return vr;
	}
	
	
	
	
}
