package net.foggies.guice.service;

import com.google.inject.Inject;
import net.foggies.guice.interfaces.Discountable;

public record CheckoutService(Discountable discountable) {

    @Inject
    public CheckoutService {
    }

    public double checkOut(double total) {
        double totalAfter = total - (total * discountable.getDiscount());

        System.out.println("Final price is " + totalAfter);

        return totalAfter;
    }

}
