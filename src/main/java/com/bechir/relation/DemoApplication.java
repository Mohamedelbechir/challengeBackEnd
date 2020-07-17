package com.bechir.relation;

import com.bechir.relation.models.Prestataire;
import com.bechir.relation.models.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String... args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Client.class, Prestataire.class);

	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedHeaders("*");
			}
		};
	}

	/*
	 * implements WebMvcConfigurer
	 * 
	 * @Override public void addCorsMappings(CorsRegistry registry) {
	 * registry.addMapping("/**") // registry.addMapping("/api/**")
	 * .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")
	 * .allowedHeaders("Origin", "Accept", "Content-Type", "Authorization")
	 * .exposedHeaders("Authorization"); }
	 */

}
