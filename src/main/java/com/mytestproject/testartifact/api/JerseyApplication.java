package com.mytestproject.testartifact.api;
import com.mytestproject.testartifact.impl.implementation;
import jakarta.ws.rs.Path;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyApplication extends ResourceConfig {
    public JerseyApplication() {
        register(implementation.class);
    }
}