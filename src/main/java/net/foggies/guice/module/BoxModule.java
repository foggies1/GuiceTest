package net.foggies.guice.module;

import com.google.inject.AbstractModule;
import net.foggies.guice.interfaces.Openable;

public class BoxModule<T extends Openable> extends AbstractModule {

    private final Class<T> clazz;

    public BoxModule(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    protected void configure() {
        bind(Openable.class).to(clazz);
    }
}
