package com.example.TicketRefundService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.kafka.annotation.EnableKafka;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableDiscoveryClient
public class TicketRefundServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketRefundServiceApplication.class, args);
	}

}
