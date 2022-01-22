package net.foggies.guice;

import net.foggies.guice.handler.BoxHandler;
import net.foggies.guice.handler.CheckoutHandler;
import net.foggies.guice.impl.Late;
import net.foggies.guice.impl.TokenBox;
import net.foggies.guice.impl.TokenItem;

public class GuiceTest {

    public static void main(String[] args) {

        CheckoutHandler checkoutHandler = new CheckoutHandler(Late.class, 1000.0D);
        BoxHandler boxHandler = new BoxHandler(TokenBox.class, new TokenItem(1000.0D));

    }

}
