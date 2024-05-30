package com.cts.userRegestration;

import ch.qos.logback.core.CoreConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserRegestrationApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserRegestrationApplication.class, args);
		System.out.println("Its Running");
	}

}
