package com.example.BlueBusEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//this is eureca server
public class BlueBusEurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(BlueBusEurekaServerApplication.class, args);
	}
}
