package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient		//zuul服务要注册到Eureka上

public class ZuulRunApp {
	
	public static void main(String[] args) {
		SpringApplication.run(ZuulRunApp.class, args);
	}
}
