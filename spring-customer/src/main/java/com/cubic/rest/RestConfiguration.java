package com.cubic.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.cubic.rest.resources.CustomerResource;
import com.cubic.rest.resources.HelloWorld;
@Configuration
@ImportResource({ "classpath*:Spring.xml" })
public class RestConfiguration extends ResourceConfig {
	public  RestConfiguration() {
		this.register(HelloWorld.class);
		this.register(CustomerResource.class);
		
	}

}

