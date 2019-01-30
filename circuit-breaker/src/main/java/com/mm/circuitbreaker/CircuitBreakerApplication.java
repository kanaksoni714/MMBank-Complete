package com.mm.circuitbreaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.cg.app.website.hello.Hello;

@SpringBootApplication
public class CircuitBreakerApplication {

	  @Autowired
	  private Hello hello;

	  @Bean
	  public RestTemplate rest(RestTemplateBuilder builder) {
	    return builder.build();
	  }

	  @RequestMapping("/to-read")
	  public String toRead() {
	    return hello.readingList();
	  }

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerApplication.class, args);
	}

}

