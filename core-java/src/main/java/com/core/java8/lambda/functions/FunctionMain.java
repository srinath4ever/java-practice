package com.core.java8.lambda.functions;

import com.strings.random.RandomSentenses;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionMain {

    public static void main(String[] args) {
        Function<String, Integer> stringLengthFunction = s -> s.length();
        System.out.println("stringLengthFunction.apply(\"srinath\") = " + stringLengthFunction.apply("srinath"));

        List<String> randomNames = new RandomSentenses().getOf(10);
        System.out.println("randomNames = " + randomNames);
        List<Integer> lengthsList = getRandomLengths(randomNames, stringLengthFunction);
        System.out.println("lengthsList = " + lengthsList);
    }

    private static <T, R> List<R> getRandomLengths(List<T> randomNames, Function<T, R> stringLengthFunction) {
        List<R> returnList = new ArrayList<>();
        randomNames.forEach(t -> returnList.add(stringLengthFunction.apply(t)));
        return returnList;
    }

}
