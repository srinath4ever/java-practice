package com.dpattern.behavioural.strategy;

@FunctionalInterface
interface BillingStrategy {

    // below one of two methods provides implementation for this
    int getActPrice(int rawPrice);

    // normal change
    static BillingStrategy normalStrategy() {
        return rawPrice -> rawPrice;
    }

    // 50% discount
    static BillingStrategy happyHoursStrategy() {
        return rawPrice -> rawPrice/2;
    }

}