package io.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@EnableTask
@SpringBootApplication
public class TaskPropertiesExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskPropertiesExampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner() {
		return args -> System.out.println("This is my task.  There are many like it, but this one is mine.");
	}
}
