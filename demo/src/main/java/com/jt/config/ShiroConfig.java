package com.jt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jt.pojo.Shiro;
//该类中表识就是xml中数据 <bean id ="方法名" class="路径/名称"/>

@Configuration
public class ShiroConfig {
	
	@Bean
	public Shiro abc() {
		 
		return new Shiro();
	}
}
