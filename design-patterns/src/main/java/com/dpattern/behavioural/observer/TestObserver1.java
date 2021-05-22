package com.dpattern.behavioural.observer;

public class TestObserver1 extends Observer {

    public TestObserver1(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
        System.out.println("Adding Observer " + this.getClass().getSimpleName());
    }

    @Override
    public void update() {
        System.out.println("TestObserver1 is updated with.." + this.subject.getState());
    }

}
