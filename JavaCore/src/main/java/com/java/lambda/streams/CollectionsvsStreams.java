package com.java.lambda.streams;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CollectionsvsStreams {

    public static void main(String[] args) {

        Predicate<String> selector = name->name.startsWith("A")||name.startsWith("J");

        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Jim");
        names.add("Jenny");

        Stream<String> namesStream = names.stream();

        namesStream.filter(selector).forEach(System.out::println);
        //namesStream.forEach(System.out::println);

    }
}
