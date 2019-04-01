
package com.example.demo.config;

import java.net.URISyntaxException;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import

org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration



public class JpaConfig {

	@Autowired
	private Environment env;
	

	
	@Bean(name ="H2DataSource")
	public DataSource dataSource1() {
		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl(
				"jdbc:h2:~/test1");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
	

		return dataSource;
	}
	
	
	
}
	