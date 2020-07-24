package com.example;

import io.swagger.v3.oas.annotations.Parameter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.concurrent.CompletableFuture;

@Path("/api")
public final class ThingController {

    private final ThingService thingService;

    public ThingController(ThingService thingService) {
        this.thingService = thingService;
    }

    @GET
    @Path("/things/{id}")
    @Produces("application/json")
    @ThingControllerFindById
    public CompletableFuture<Thing> findById(
            @PathParam("id") @Parameter(description = "The thing id", required = true) int id
    ) {
        return thingService.findById(id);
    }

}
