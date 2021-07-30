
package com.example.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket api(){
		 return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .paths(PathSelectors.ant("/products/**"))
	                .apis(RequestHandlerSelectors.basePackage("com.example"))
	                .build()
	                .apiInfo(apiInfo());
	    }

	private ApiInfo apiInfo() {
		return new ApiInfo(
	            "User API Service", //Title
	            "The Api handles the basic CRUD operation for user management", //Description
	            "Version 1.1",//Version
	            "My Terms of Service",
	            new Contact("Ms krithiga","krithigaa@gmail.com","kiki@outlook.com"),
	            "License of API",
	            "Api Licene url",
	            Collections.emptyList());
	}

}