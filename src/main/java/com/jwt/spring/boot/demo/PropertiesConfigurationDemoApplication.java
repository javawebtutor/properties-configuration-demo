package com.jwt.spring.boot.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jwt.spring.boot.demo.properties.DevConfigProps;
import com.jwt.spring.boot.demo.properties.ProdConfigProps;
import com.jwt.spring.boot.demo.properties.QAConfigProps;

@SpringBootApplication
public class PropertiesConfigurationDemoApplication implements CommandLineRunner {
	
	@Autowired
	private DevConfigProps devConfigProps;
	
	@Autowired
	private QAConfigProps qaConfigProps;
	
	@Autowired
	private ProdConfigProps prodConfigProps;
	
	private static final Logger LOG = LoggerFactory.getLogger(PropertiesConfigurationDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PropertiesConfigurationDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 LOG.info("-------------Dev Properties-----------------");
	        LOG.info("Name: {}", devConfigProps.getName());
	        LOG.info("Port: {}", devConfigProps.getPort());
	        LOG.info("DB Type: {}", devConfigProps.getDbType());
	        LOG.info("Version: {}", devConfigProps.getVersion());
	        LOG.info("DB Url: {}", devConfigProps.getDbUrl());
	        LOG.info("DB name: {}", devConfigProps.getDbName());
	        LOG.info("DB User: {}", devConfigProps.getDbUser());
	        LOG.info("DB Password: {}", devConfigProps.getDbPassword());
	        
	        LOG.info("-------------QA Properties-----------------");
	        LOG.info("Name: {}", qaConfigProps.getName());
	        LOG.info("Port: {}", qaConfigProps.getPort());
	        LOG.info("DB Type: {}", qaConfigProps.getDbType());
	        LOG.info("Version: {}", qaConfigProps.getVersion());
	        LOG.info("DB Url: {}", qaConfigProps.getDbUrl());
	        LOG.info("DB name: {}", qaConfigProps.getDbName());
	        LOG.info("DB User: {}", qaConfigProps.getDbUser());
	        LOG.info("DB Password: {}", qaConfigProps.getDbPassword());

	}

}
