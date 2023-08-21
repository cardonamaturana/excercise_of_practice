package com.cardonamaturana.PersonalPractice;

import com.cardonamaturana.PersonalPractice.learnstrings.StringInitialization;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cardonamaturana.PersonalPractice")
public class PersonalPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalPracticeApplication.class, args);

		StringInitialization.start();



	}

}
