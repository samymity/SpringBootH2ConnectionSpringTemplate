package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
//@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class })

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")
//@EnableJpaRepositories("com.example.demo.repository")

public class FuelTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuelTestApplication.class, args);
	}

}
