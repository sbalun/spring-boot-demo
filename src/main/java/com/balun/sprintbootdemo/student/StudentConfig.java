package com.balun.sprintbootdemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jerry = new Student(
                    "Jerry",
                    "jgarcia@email.com",
                    LocalDate.of(2000,JANUARY,5),
                    21
            );
            Student phil = new Student(
                    "Phil",
                    "plesh@email.com",
                    LocalDate.of(1995,JANUARY,5),
                    26
            );
            repository.saveAll(List.of(jerry,phil));
        };
    }
}
