package com.sns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.SubscribeRequest;

@SpringBootApplication
@RestController
public class SpringAwsSnsDemoApplication {

	@Autowired
	private AmazonSNSClient amazonSNSClient;
	
	String TOPIC_ARN = "arn:aws:sns:us-east-1:850763061324:nishant-topic";
	
	@GetMapping("/subcription/{email}")
	public String addSubcription(@PathVariable String email) {
		SubscribeRequest request = new SubscribeRequest(TOPIC_ARN, "email",email);
		return "subcription request is pending, to confirm the subscription check your email: "+email;
		
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAwsSnsDemoApplication.class, args);
	}

}
