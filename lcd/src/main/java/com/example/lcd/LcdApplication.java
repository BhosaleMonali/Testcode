// package com.example.lcd;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication

// public class LcdApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(LcdApplication.class, args);
// 	}

// }

// #-----------------------------------------------------

// package com.example.lcd;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication

// public class LcdApplication {
// 	public static void main(String[] args) {
// 		System.out.println("....Hello World");
// 	}

// }

// #-----------------------------------------------------
package com.example.lcd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController

@SpringBootApplication  
public class LcdApplication {
	@RequestMapping("/")
	public String hello() {
		return "Hello Maven Sppring boot Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(LcdApplication.class, args);  
	}

}  