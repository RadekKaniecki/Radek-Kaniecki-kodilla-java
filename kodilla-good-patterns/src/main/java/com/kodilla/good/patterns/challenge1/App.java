package com.kodilla.good.patterns.challenge1;

import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        MovieStore ms = new MovieStore();

        String result = ms.getMovies().entrySet().stream()
                .flatMap(l -> l.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(result);
    }
}
