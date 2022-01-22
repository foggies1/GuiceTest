package net.foggies.guice.impl;

import net.foggies.guice.interfaces.Openable;

public class TokenBox implements Openable {

    @SafeVarargs
    @Override
    public final <T> void onOpen(T... params) {
        TokenItem tokenItem = (TokenItem) params[0];
        System.out.println("You've opened a Token Box and received " + tokenItem.getAmount() + " Tokens.");
    }

}
