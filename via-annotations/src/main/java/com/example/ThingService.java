package com.example;

import java.util.concurrent.CompletableFuture;

public interface ThingService {

    CompletableFuture<Thing> findById(int id);

    CompletableFuture<Thing> create(TransientThing transientThing);

}
