package com.rto.rtotracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RtotrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RtotrackerApplication.class, args);
	}
	 @GetMapping("/greeting")
	  public String sample()
	  {
	    return "home is printed";
	  }
}
