package com.adoo.grupo7.api.gestionconsorcio.endpoints;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.springframework.stereotype.Service;

@Service
@Path("/helloWithParam")
public class HelloWithQueryParam {

    @GET
    @Produces("text/plain")
    public String reverse(@QueryParam("data") @NotNull String data) {
        return new StringBuilder(data).reverse().toString();
    }
}