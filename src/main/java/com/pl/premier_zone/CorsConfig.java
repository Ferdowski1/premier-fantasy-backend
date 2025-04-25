package com.pl.premier_zone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // Allow API routes
                        .allowedOrigins("http://localhost:3000",
                                        "https://nathan-ferdowski.vercel.app",
                                        "https://nathanferdowski.dev",
                                        "http://nathanferdowski.dev",
                                        "https://www.nathanferdowski.dev", 
                                        "http://www.nathanferdowski.dev" )
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }
}
