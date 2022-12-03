package ru.sfu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Application
 */
@SpringBootApplication
public class Application {

    /**
     * Run Application
     * @param args Arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
