package com.dpattern.structural.adapter;

import java.util.stream.IntStream;

/**
 * Adapter class to convert Turkey in to Duck
 *
 * @author Srinath.Rayabarapu
 */
public class TurkeytoDuckAdapter implements Duck {

    private Turkey turkey;

    public TurkeytoDuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        IntStream.range(0, 2).forEach(i -> this.turkey.fly());
    }

    @Override
    public void quack() {
        // real use
        this.turkey.gobble();
    }

}