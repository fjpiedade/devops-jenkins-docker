package com.devops.jenkinsdockerintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDockerIntegrationApplication {

	@GetMapping("/")
	public String message(){
		return "Welcome at RaizTech, DevOps Concepts ...";
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsDockerIntegrationApplication.class, args);
	}

}
