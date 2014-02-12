package com.hosegood.tddbyexample;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
        this.currency = "CHF";
    }

    @Override
    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
