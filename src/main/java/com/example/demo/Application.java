package com.example.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
    	return args -> {
    		Student maria = new Student("Maria", "Jones", "maria.jones@yahoo.com", 21);
    		Student alex = new Student("Alex", "Gulster", "alex.@gmail.com", 25);
    		studentRepository.saveAll(List.of(maria,alex));
    	};
    }

}
