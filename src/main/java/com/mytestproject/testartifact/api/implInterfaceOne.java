package com.mytestproject.testartifact.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Service;

@Service
@Path("/test")
public interface implInterfaceOne {

    @GET
    @Path("/order")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOrderResponse(@QueryParam("item") String item, @QueryParam("quantity") int quantity);

}
