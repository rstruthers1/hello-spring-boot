package com.example.hello;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		// Check if the application is running in production
		String env = System.getenv("SPRING_PROFILES_ACTIVE");
		System.out.println("env: " + env);
		if (env == null || !env.equals("prod")) {
			Dotenv dotenv = Dotenv.load();
			System.setProperty("spring.datasource.url", dotenv.get("SPRING_DATASOURCE_URL"));
			System.setProperty("spring.datasource.username", dotenv.get("SPRING_DATASOURCE_USERNAME"));
			System.setProperty("spring.datasource.password", dotenv.get("SPRING_DATASOURCE_PASSWORD"));
			System.setProperty("spring.security.user.password", dotenv.get("SPRING_SECURITY_USER_PASSWORD"));

		}
		SpringApplication.run(HelloApplication.class, args);
	}

}
