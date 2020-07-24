package com.example;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Operation(
        summary = "Finds a thing by id",
        description = "Returns a thing",
        responses = {
                @ApiResponse(description = "The thing", content = @Content(schema = @Schema(implementation = Thing.class))),
                @ApiResponse(responseCode = "404", description = "Thing not found")
        }
)
@Target(METHOD)
@Retention(RUNTIME)
public @interface ThingControllerFindById {

}
