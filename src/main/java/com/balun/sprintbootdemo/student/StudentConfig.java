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
                    "Brooke",
                    "brooke@email.com",
                    LocalDate.of(1970,JANUARY,15)
            );
            Student phil = new Student(
                    "Scott",
                    "scott@email.com",
                    LocalDate.of(1971,JANUARY,22)
            );
            repository.saveAll(List.of(jerry,phil));
        };
    }
}
