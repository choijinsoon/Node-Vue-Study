package com.newlecture.rlandapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
  
  @Bean
  WebMvcConfigurer webMvcConfigurer(){
    WebMvcConfigurer configurer = new WebMvcConfigurer() {
      public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**").allowedOrigins("http://localhost:5173/")
                .allowedMethods(
                  HttpMethod.GET.name(),
                  HttpMethod.POST.name(),
                  HttpMethod.PUT.name(),
                  HttpMethod.DELETE.name()
                );
      };
    };
    return configurer;
  }

}
