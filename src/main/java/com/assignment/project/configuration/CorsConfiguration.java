package com.assignment.project.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns(
                "http://localhost:3000",
                "https://*.netlify.app",
                "https://rakeshsagar89.github.io"
                )
                .allowedMethods("*")
                .allowedHeaders("*")
                .exposedHeaders("Location")
                .allowCredentials(true);
    }
}

