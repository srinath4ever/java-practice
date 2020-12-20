package com.dpattern.behavioural.observer;

public class TestObserver2 extends Observer {

    public TestObserver2(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
        System.out.println("Adding Observer " + this.getClass().getSimpleName());
    }

    @Override
    public void update() {
        System.out.println("TestObserver2 is updated with.." + this.subject.getState());
    }

}
