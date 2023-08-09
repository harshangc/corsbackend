package com.harshang.springboot.corsbackend;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CorsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorsBackendApplication.class, args);
	}

	@Bean
    CommandLineRunner init(PersonRepository personRepository) {
        return args -> {
            Stream.of("A", "B", "C").forEach(name -> {
                Person person = new Person(name, name.toLowerCase() + "@domain.com");
                personRepository.save(person);
            });
            personRepository.findAll().forEach(System.out::println);
        };
    }

}
