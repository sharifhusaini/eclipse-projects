package com.cubic.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({ "classpath*:Spring.xml" })
@ComponentScan("com.cubic.rest")
public class Application {
    public static void main( String[] args ) {
    	SpringApplication.run(Application.class, args);
    
    }
}
