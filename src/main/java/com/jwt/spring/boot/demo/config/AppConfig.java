package com.jwt.spring.boot.demo.config;

import org.springframework.context.annotation.Configuration;

import com.jwt.spring.boot.demo.properties.DevConfigProps;
import com.jwt.spring.boot.demo.properties.ProdConfigProps;
import com.jwt.spring.boot.demo.properties.QAConfigProps;

@Configuration
public class AppConfig {

	private DevConfigProps devConfigProps;
	private QAConfigProps qaConfigProps;
	private ProdConfigProps prodConfigProps;

	public AppConfig(DevConfigProps devConfigProps, QAConfigProps qaConfigProps, ProdConfigProps prodConfigProps) {
		this.devConfigProps = devConfigProps;
		this.qaConfigProps = qaConfigProps;
		this.prodConfigProps = prodConfigProps;
	}

}
