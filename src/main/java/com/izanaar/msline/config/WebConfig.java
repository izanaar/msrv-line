package com.izanaar.msline.config;

import com.izanaar.msline.controller.IndexController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = IndexController.class)
public class WebConfig extends WebMvcConfigurerAdapter {

}
