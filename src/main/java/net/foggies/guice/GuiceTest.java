package net.foggies.guice;

import net.foggies.guice.handler.CheckoutHandler;
import net.foggies.guice.impl.Late;

public class GuiceTest {

    public static void main(String[] args) {

        CheckoutHandler checkoutHandler = new CheckoutHandler(Late.class, 1000.0D);

    }

}
