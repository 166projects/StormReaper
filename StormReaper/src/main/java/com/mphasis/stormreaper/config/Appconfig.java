package com.mphasis.stormreaper.config;


import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@Configuration
@EnableWebMvc
@EnableAspectJAutoProxy
@EnableTransactionManagement
@ComponentScan(basePackages="com.mphasis.stormreaper")
public class Appconfig {

	
	@Bean
	public DriverManagerDataSource getDataSource()
	{ 
	 DriverManagerDataSource ds=new DriverManagerDataSource();
	 ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	 ds.setUrl("jdbc:oracle:thin:@172.17.44.138:1521:xe");
	 ds.setUsername("sagar");
	 ds.setPassword("sagar");
    return ds;
	}
    
    @Bean
    public LocalSessionFactoryBean getSessionFactory()
    {  
    	LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
    sessionFactory.setDataSource(getDataSource());
    Properties props=new Properties();
    props.put("hibernate.dialect","org.hibernate.dialect.OracleDialect");
    props.put("hibernate.hbm2ddl.auto", "update");
    props.put("hibernate.show_sql","true");
    props.put("hibernate.format_sql", "true");
    props.put("hibernate.default_schema","shipproject");
    sessionFactory.setHibernateProperties(props);
    sessionFactory.setPackagesToScan("com.mphasis.stormreaper.entities");
    return sessionFactory;
    
    
    }
    

    @Bean
    public AspectHelper getAspect() {
    	return new AspectHelper();
    }
    
    
    @Bean
    public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
    {
    	HibernateTransactionManager  hibernateTransactionManager=new HibernateTransactionManager();
    	hibernateTransactionManager.setSessionFactory(sessionFactory);
    	return hibernateTransactionManager;
    }
    
    
    


     
}

