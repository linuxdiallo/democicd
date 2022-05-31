package com.example.democicd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class DemocicdApplication {

	public static Logger logger = LoggerFactory.getLogger(DemocicdApplication.class);

	@PostConstruct
    public void init() {
		logger.info("Application started");
	}

	public static void main(String[] args) {
        logger.info("Application executed");
		SpringApplication.run(DemocicdApplication.class, args);
	}

	@GetMapping("hello")
	public String welocome() {
		return "Hello you are welcome";
	}

}
