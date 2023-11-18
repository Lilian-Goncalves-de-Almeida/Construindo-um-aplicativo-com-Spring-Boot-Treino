package com.exampleapi.testeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TesteapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteapiApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			System.out.println("Let's see the beans names:");
			String []  beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String b: beanNames) {
				System.out.println(b);
			}
		};
	}

}
