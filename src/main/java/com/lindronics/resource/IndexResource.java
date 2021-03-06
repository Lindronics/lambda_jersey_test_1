package com.lindronics.resource;


import java.util.Map;
import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class IndexResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.WILDCARD)
    public Response ping() {
        Map<String, String> pong = new HashMap<>();
        pong.put("test", "Hello, hello, hello!");
        return Response.status(200).entity(pong).build();
    }
}