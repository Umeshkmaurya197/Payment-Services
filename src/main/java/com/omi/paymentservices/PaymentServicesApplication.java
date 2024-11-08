package com.omi.paymentservices;

import com.omi.paymentservices.controller.PaymentController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentServicesApplication {
	private static final Logger log = (Logger) LoggerFactory.getLogger(PaymentServicesApplication.class);

	public static void main(String[] args) {
		log.info("PaymentServicesApplication => main  :");
		SpringApplication.run(PaymentServicesApplication.class, args);
	}

}
