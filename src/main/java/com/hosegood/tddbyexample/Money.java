/*
 * Copyright 2014 Corelogic Ltd All Rights Reserved.
 */
package com.hosegood.tddbyexample;

public abstract class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return this.amount == money.amount && this.getClass().equals(money.getClass());
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    String currency() {
        return this.currency;
    }
}
