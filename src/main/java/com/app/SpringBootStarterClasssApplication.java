package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.app.model.Admin;
import com.app.model.Product;

@SpringBootApplication
public class SpringBootStarterClasssApplication implements CommandLineRunner{

	@Autowired
	private Product p;
	@Autowired
	private Admin a;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterClasssApplication.class, args);
		System.out.println("**Starter class main method executed");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("From starter class :"+p);
		System.out.println("From starter class :"+a);	
	}
	@Bean
	public Product proj() {
		Product p = new Product();
		p.setProdId(300);
		p.setProdName("Mobile");
		return p;

	}
}