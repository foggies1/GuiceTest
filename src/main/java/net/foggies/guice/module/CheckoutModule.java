package net.foggies.guice.module;

import com.google.inject.AbstractModule;
import net.foggies.guice.interfaces.Discountable;

public class CheckoutModule<T extends Discountable> extends AbstractModule {

    private Class<T> clazz;

    public CheckoutModule(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    protected void configure() {
        bind(Discountable.class).to(clazz);
    }


}
