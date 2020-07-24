package com.example;

import java.util.concurrent.CompletableFuture;

public final class ThingController implements ThingControllerDocs {

    private final ThingService thingService;

    public ThingController(ThingService thingService) {
        this.thingService = thingService;
    }

    @Override
    public CompletableFuture<Thing> findById(int id) {
        return thingService.findById(id);
    }

}
