package com.ms.pluralsight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PluralsightCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightCourseApplication.class, args);
	}

}
