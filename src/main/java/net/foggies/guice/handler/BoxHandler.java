package net.foggies.guice.handler;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.foggies.guice.interfaces.Openable;
import net.foggies.guice.module.BoxModule;
import net.foggies.guice.service.BoxService;

public class BoxHandler {

    @SafeVarargs
    public <T extends Openable, V> BoxHandler(Class<T> clazz, V... params) {
        Injector injector = Guice.createInjector(new BoxModule<>(clazz));
        BoxService boxService = injector.getInstance(BoxService.class);
        boxService.process(params);
    }

}
