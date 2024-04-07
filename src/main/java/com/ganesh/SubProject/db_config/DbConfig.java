package com.ganesh.SubProject.db_config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(
//		entityManagerFactoryRef="entityManagerFactoryBean",
//		basePackages= {"com.ganesh.SubProject.repo"},
//		transactionManagerRef="transactionManager"
//		
//		)
public class DbConfig {
	
//	//datasource
//	@Autowired
//	private Environment environment;
//
//	
//	@Bean
//	@Primary
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource=new DriverManagerDataSource();
//
//		
//		
//		dataSource.setDriverClassName(environment.getProperty("jar.db.driver-class-name"));
//		dataSource.setUrl(environment.getProperty("jar.db.url"));
//		dataSource.setUsername(environment.getProperty("jar.db.username"));
//		dataSource.setPassword(environment.getProperty("jar.db.password"));
//		return dataSource;
//	}
//	
//	
//	//entityManagerFactory
//	@Bean(name = "entityManagerFactoryBean")
//	@Primary
//	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
//		
//		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean=new LocalContainerEntityManagerFactoryBean();
//		
//		entityManagerFactoryBean.setDataSource(dataSource());
//		
//		
//		JpaVendorAdapter adapter=new HibernateJpaVendorAdapter();
//		
//		Map<String, Object> map=new HashMap<>();
//		
//		
//		/**
//		 * hibernate.dialect = org.hibernate.dialect.MySQL8Dialect
//		 * spring.jpa.hibernate.ddl-auto=update
//	spring.jpa.properties.hibernate.format_sql=true
//	spring.jpa.show-sql=true
//		 */
//		
//		map.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//		map.put("spring.jpa.hibernate.ddl-auto", "update");
//		map.put("spring.jpa.properties.hibernate.format_sql", "true");
//		map.put("spring.jpa.show-sql", "true");
//		
//		entityManagerFactoryBean.setJpaPropertyMap(map);
//		entityManagerFactoryBean.setPackagesToScan("com.ganesh.SubProject.entity");
//		entityManagerFactoryBean.setJpaVendorAdapter(adapter);
//		
//		return entityManagerFactoryBean;
//	}
//	
//	
//	//platformTransactionManager
//	
//	@Primary
//	@Bean(name = "transactionManager")
//	public PlatformTransactionManager platformTransactionManager() {
//		JpaTransactionManager transactionManager=new JpaTransactionManager();
//		
//		transactionManager.setEntityManagerFactory(entityManagerFactoryBean().getObject());
//		
//		return transactionManager;
//	}

}
