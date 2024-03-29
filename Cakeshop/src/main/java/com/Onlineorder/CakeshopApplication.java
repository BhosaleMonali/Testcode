package com.Onlineorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="cakeapi")
@EnableJpaRepositories(basePackages = "cakeapi")
@EntityScan(basePackages = "cakeapi")
public class CakeshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(CakeshopApplication.class, args);
	}

}
