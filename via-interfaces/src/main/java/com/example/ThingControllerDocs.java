package com.example;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import javax.ws.rs.GET;
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

}
