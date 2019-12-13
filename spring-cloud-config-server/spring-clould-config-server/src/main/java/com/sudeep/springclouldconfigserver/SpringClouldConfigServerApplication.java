package com.sudeep.springclouldconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableConfigServer
public class SpringClouldConfigServerApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringClouldConfigServerApplication.class, args);
	}

}
