package com.example.testgithubcodespaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.testgithubcodespaces")
@EnableJpaRepositories(basePackages = "com.example.testgithubcodespaces")
//@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

   /*
   	@GetMapping("/")
	public String hello() {
		return "Hello from GitHub Codespaces!";
	}
   */

}
