package br.edu.fapce.nexti.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"Repository"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
