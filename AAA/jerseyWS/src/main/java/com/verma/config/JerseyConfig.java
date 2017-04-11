package com.verma.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.verma.endpoints.HelloWorldEndpoint;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        registerEndpoints();
    }
    private void registerEndpoints() {
    	//packages("endpoints");
		register(HelloWorldEndpoint.class);
    }
}