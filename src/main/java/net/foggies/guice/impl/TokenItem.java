package net.foggies.guice.impl;

import net.foggies.guice.interfaces.EconomyItem;

public record TokenItem(double amount) implements EconomyItem {

    @Override
    public double getAmount() {
        return this.amount;
    }

}
