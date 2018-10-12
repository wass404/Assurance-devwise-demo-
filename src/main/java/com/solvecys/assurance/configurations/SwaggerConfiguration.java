package com.solvecys.assurance.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@ComponentScan({ "com.solvecys.controllers", "com.solvecys.configurations", "com.solvecys.repositories", "com.solvecys.entities", "com.solvecys.services" })
@Configuration
public class SwaggerConfiguration {
	private static final String SWAGGER_API_VERSION = "1";
	private static final String LICENSE_TEXT = "License";
	private static final String TITLE = "Products REST API";
	private static final String DESCRIPTION = "REST API for Assurance";

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(this.TITLE).description(this.DESCRIPTION).license(this.LICENSE_TEXT)
				.version(this.SWAGGER_API_VERSION).build();
	}

	@Bean
	public Docket projectMangmentDocket() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(this.apiInfo()).pathMapping("/").select()
				.paths(PathSelectors.regex("/api.*")).build();
	}
}
