package com.cafeManha.cafeManha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CafeManhaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CafeManhaApplication.class, args);
		System.out.println("[Run]");
	}

	// @Bean
	// public WebMvcConfigurer corsConfigurer() {
	// 	return new WebMvcConfigurer() {
	// 		@Override
	// 		public void addCorsMappings(CorsRegistry registry) {
	// 			registry.addMapping("/*/*")
	// 			.allowedOrigins("*")
	// 			.allowedMethods("*")
	// 			.allowedHeaders("*")
	// 			.allowCredentials(true)
	// 			.exposedHeaders("")
	// 			.maxAge(3600);
	// 		}
	// 	};
	// }
}