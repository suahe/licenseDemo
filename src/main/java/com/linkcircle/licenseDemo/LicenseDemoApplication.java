package com.linkcircle.licenseDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.linkcircle.license","com.linkcircle.licenseDemo"})
public class LicenseDemoApplication {

	public static void main(String[] args){
		SpringApplication application = new SpringApplication(LicenseDemoApplication.class);
		application.run(args);

	}

}
