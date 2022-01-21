package net.foggies.guice.handler;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.foggies.guice.module.CheckoutModule;
import net.foggies.guice.service.CheckoutService;
import net.foggies.guice.interfaces.Discountable;

public class CheckoutHandler {

    public <T extends Discountable> CheckoutHandler(Class<T> clazz, double checkoutAmount) {
        Injector injector = Guice.createInjector(new CheckoutModule<>(clazz));
        CheckoutService checkoutService = injector.getInstance(CheckoutService.class);

        checkoutService.checkOut(checkoutAmount);
    }

}
