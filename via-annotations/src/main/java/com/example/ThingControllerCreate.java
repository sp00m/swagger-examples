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
        summary = "Creates a new thing",
        description = "Returns the created thing",
        responses = {
                @ApiResponse(description = "The created thing", content = @Content(schema = @Schema(implementation = Thing.class))),
                @ApiResponse(responseCode = "400", description = "Invalid thing")
        }
)
@Target(METHOD)
@Retention(RUNTIME)
public @interface ThingControllerCreate {
}
