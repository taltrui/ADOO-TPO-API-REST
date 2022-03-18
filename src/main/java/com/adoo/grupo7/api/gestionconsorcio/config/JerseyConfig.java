package com.adoo.grupo7.api.gestionconsorcio.config;

import com.adoo.grupo7.api.gestionconsorcio.endpoints.HelloService;
import com.adoo.grupo7.api.gestionconsorcio.endpoints.HelloWithQueryParam;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
            register(HelloService.class);
            register(HelloWithQueryParam.class);
    }
}
