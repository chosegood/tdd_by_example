/*
 * Copyright 2014 Corelogic Ltd All Rights Reserved.
 */
package com.hosegood.tddbyexample;

public class Money {

    protected int amount;

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return this.amount == money.amount;
    }

}
