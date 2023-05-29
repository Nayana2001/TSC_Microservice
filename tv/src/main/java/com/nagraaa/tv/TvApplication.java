package com.nagraaa.tv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
public class TvApplication {

	public static void main(String[] args) {

		SpringApplication.run(TvApplication.class, args);
	}

}
