package com.omi.paymentservices.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
public class PaymentController {

	private static final Logger log = (Logger) LoggerFactory.getLogger(PaymentController.class);

	@GetMapping("/pay/{price}")
	public String payNow(@PathVariable int price){
		log.info("PaymentController => payNow  :"+price);
		return " Payment Amount "+price+" is successfully";
	}
}
