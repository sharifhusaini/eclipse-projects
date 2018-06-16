package com.cubic.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloWorld {
	
	@GET
	public String helloWorld() {
		return "welcome to restfull webservices";
	}

}
