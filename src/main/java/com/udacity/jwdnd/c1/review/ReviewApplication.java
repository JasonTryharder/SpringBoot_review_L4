package com.udacity.jwdnd.c1.review;

import com.udacity.jwdnd.c1.review.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}
//	@Bean
//	public String message(){
//		System.out.println("Creating message Bean");
//		return "Hello Spring";
//	}
//
//	@Bean
//	public String upperCaseMessage(MessageService messageService) {
//		System.out.println("Creating upperCaseMessage Bean");
//		return messageService.uppercase();
//	}
//
//	@Bean
//	public String lowerCaseMessage(MessageService messageService) {
//		System.out.println("Creating lowerCaseMessage Bean");
//		return messageService.lowercase();
//	}

}
