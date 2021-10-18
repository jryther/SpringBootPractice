package com.joshryther.springbootpractice.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student miriam = new Student(
                    1L,
                    "Miriam",
                    "miriam.jamal@gmail.com",
                    LocalDate.of(2000, 1, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, 1, 5)
            );

            repository.saveAll(
                    List.of(miriam, alex)
            );
        };
    }
}
