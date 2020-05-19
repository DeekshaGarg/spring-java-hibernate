package com.example.moviecatalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.example"})
@EnableJpaRepositories("com.example.dao")
@EntityScan("com.example.dao")
public class MoviecatalogueApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(MoviecatalogueApplication.class, args);
		
		/*
		 * SpringApplication app = new
		 * SpringApplication(MoviecatalogueApplication.class);
		 * app.setBannerMode(Banner.Mode.OFF); app.setLazyInitialization(true);
		 * app.run(args);
		 */
	}

}