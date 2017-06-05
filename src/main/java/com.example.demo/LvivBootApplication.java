package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Serzh on 6/3/17.
 */
@SpringBootApplication
@EnableScheduling
public class LvivBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LvivBootApplication.class, args);
	}
}
