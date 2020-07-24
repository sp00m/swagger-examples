package com.example;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.concurrent.CompletableFuture;

@Path("/api")
public interface ThingControllerDocs {

    @GET
    @Path("/things/{id}")
    @Produces("application/json")
    @Operation(
            summary = "Finds a thing by id",
            description = "Returns a thing",
            responses = {
                    @ApiResponse(description = "The thing", content = @Content(schema = @Schema(implementation = Thing.class))),
                    @ApiResponse(responseCode = "404", description = "Thing not found")
            }
    )
    CompletableFuture<Thing> findById(
            @PathParam("id") @Parameter(description = "The thing id", required = true) int id
    );

    @POST
    @Path("/things")
    @Consumes("application/json")
    @Produces("application/json")
    @Operation(
            summary = "Creates a new thing",
            description = "Returns the created thing",
            responses = {
                    @ApiResponse(description = "The created thing", content = @Content(schema = @Schema(implementation = Thing.class))),
                    @ApiResponse(responseCode = "400", description = "Invalid thing")
            }
    )
    CompletableFuture<Thing> create(
            @RequestBody(description = "The thing to create", required = true) TransientThing transientThing
    );

}
