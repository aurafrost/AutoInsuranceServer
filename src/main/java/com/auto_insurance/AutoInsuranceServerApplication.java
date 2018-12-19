package com.auto_insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@ComponentScan("com.auto_insurance.*")
//@CrossOrigin(origins = "*")
public class AutoInsuranceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoInsuranceServerApplication.class, args);
	}

}