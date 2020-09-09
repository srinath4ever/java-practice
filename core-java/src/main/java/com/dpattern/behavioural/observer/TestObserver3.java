package com.dpattern.behavioural.observer;

public class TestObserver3 extends Observer {

    public TestObserver3(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
        System.out.println("Adding Observer " + this.getClass().getSimpleName());
    }

    @Override
    public void update() {
        System.out.println("TestObserver3 is updated with.." + this.subject.getState());
    }

}