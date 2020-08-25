package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.model.Admin;

@Configuration
public class AppConfig {

	@Bean
	public Admin aobj() {
	Admin a = new Admin();
	a.setAdminId(100);
	a.setAdminName("Saurabh");
	return a;
}
}
