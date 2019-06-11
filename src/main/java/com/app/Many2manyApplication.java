package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.app.model.Users;

@SpringBootApplication(scanBasePackages = "com.app.*")
public class Many2manyApplication {

	public static void main(String[] args) {
		SpringApplication.run(Many2manyApplication.class, args);
		saveUsersByName();
	}

	private static void saveUsersByName() {

		final String uri = "http://localhost:8090/many2many/saveUser/user";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> result = restTemplate.postForEntity(uri, Users.class, String.class);

		System.out.println(result);
	}

}
