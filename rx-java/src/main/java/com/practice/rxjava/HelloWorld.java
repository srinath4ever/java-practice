package com.practice.rxjava;

import io.reactivex.Flowable;

public class HelloWorld {
    public static void main(String[] args) {
        Flowable.just("Hello world").subscribe(System.out::println);
    }
}
