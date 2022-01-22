package net.foggies.guice.service;

import com.google.inject.Inject;
import net.foggies.guice.interfaces.Openable;

public record BoxService(Openable openable) {

    @Inject
    public BoxService {
    }

    @SafeVarargs
    public final <V> void process(V... params){
        openable.onOpen(params);
    }

}
