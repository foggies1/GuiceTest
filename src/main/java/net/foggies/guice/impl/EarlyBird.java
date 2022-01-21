package net.foggies.guice.impl;

import net.foggies.guice.interfaces.Discountable;

public class EarlyBird implements Discountable {

    @Override
    public double getDiscount() {
        return 0.35;
    }

}
