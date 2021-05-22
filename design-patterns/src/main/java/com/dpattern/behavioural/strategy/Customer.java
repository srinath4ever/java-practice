package com.dpattern.behavioural.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author Srinath.Rayabarapu
 */
public class Customer {

    private BillingStrategy billingStrategy;
    private final List<Integer> drinks = new ArrayList<>();

    public Customer(BillingStrategy strategy) {
        this.billingStrategy = strategy;
    }

    public void add(int amount, int quantity) {
        this.drinks.add(this.billingStrategy.getActPrice(amount*quantity));
    }

    public void setStrategy(BillingStrategy strategy) {
        this.billingStrategy = strategy;
    }

    public int getBill() {
        int sum = drinks.stream().mapToInt(value -> value).sum();
        this.drinks.clear();
        return sum;
    }
}
