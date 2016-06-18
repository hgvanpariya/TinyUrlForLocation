package com.shortlocation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ShortLocationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ShortLocationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
