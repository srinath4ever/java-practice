package com.dpattern.behavioural.strategy;

/**
 * TODO:
 * <p>
 * https://en.wikipedia.org/wiki/Strategy_pattern#Java
 * https://www.developer.com/java/data/implementing-strategy-patterns-in-java.html
 *
 * @author Srinath.Rayabarapu
 */
public class StrategyPatternMain {

    public static void main(String[] args) {

        // defining the strategies
        BillingStrategy normalStrategy = BillingStrategy.normalStrategy();
        BillingStrategy happyHoursStrategy = BillingStrategy.happyHoursStrategy();

        Customer firstCustomer = new Customer(normalStrategy);
        firstCustomer.add(100, 1);

        firstCustomer.setStrategy(happyHoursStrategy);
        firstCustomer.add(100, 2);

        Customer secondCustomer = new Customer(happyHoursStrategy);
        secondCustomer.add(80, 1);

        System.out.println("First customer bill : " + firstCustomer.getBill());

        secondCustomer.setStrategy(normalStrategy);
        secondCustomer.add(130, 2);
        secondCustomer.add(250, 1);
        System.out.println("Second customer bill : " + secondCustomer.getBill());

    }

}