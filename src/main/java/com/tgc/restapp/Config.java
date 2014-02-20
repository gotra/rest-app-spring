package com.tgc.restapp;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * Created by gururra on 2/19/14.
 */
@Configuration
@ComponentScan("com.tgc.restapp")
@EnableWebMvc
public class Config {

 @Bean
 public UrlBasedViewResolver setupViewResolver() {
 UrlBasedViewResolver resolver = new UrlBasedViewResolver();
 resolver.setPrefix("/WEB-INF/views/");
 resolver.setSuffix(".jsp");
 resolver.setViewClass(JstlView.class);
 return resolver;
 }



}
