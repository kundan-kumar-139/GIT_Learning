package com.fluentbuilder;

import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.fluentbuilder.beans.Radio;

@SpringBootApplication
public class FluentBuilderApplication {
	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(FluentBuilderApplication.class);
		//builder = builder.bannerMode(Mode.OFF);
		builder.banner(new ResourceBanner(new ClassPathResource("banner1.txt")));
		
		SpringApplication springApplication = builder.build();

		ApplicationContext context = springApplication.run(args);
		Radio radio = context.getBean("radio", Radio.class);
		radio.listen();
	}
}













