package com.search.analytics.phonesearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@springfox.documentation.swagger2.annotations.EnableSwagger2
public class NameSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(NameSearchApplication.class, args);
	}
}
