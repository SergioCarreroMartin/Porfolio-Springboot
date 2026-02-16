package com.sergio.portfolioweb.portfolio.config;

//import java.util.List;

//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import com.sergio.portfolioweb.portfolio.models.Project;
//import com.sergio.portfolioweb.portfolio.repositories.ProjectRepository;

@Configuration
public class DataConfig {
    /*@Bean
    CommandLineRunner initDatabase(ProjectRepository repository) {
        return args -> {
            repository.save(new Project(
                null, 
                "Mi Portfolio", 
                "Web desarrollada con Spring Boot", 
                "http://github.com/...", 
                List.of("Java", "Spring Boot", "Thymeleaf", "JPA") // <--- ¡Este Proyecto!
            ));
            
            repository.save(new Project(
                null, 
                "E-commerce API", 
                "Backend para una tienda online", 
                "http://github.com/...", 
                List.of("Java", "Spring Boot", "MySQL", "Docker")
            ));
        };
    }*/
}
