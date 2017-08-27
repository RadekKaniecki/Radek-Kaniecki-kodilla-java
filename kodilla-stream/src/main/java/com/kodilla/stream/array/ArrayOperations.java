package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(System.out::println);

        OptionalDouble optionalAverage = IntStream.range(0, numbers.length)
                .average();

        if(optionalAverage.isPresent()) {
            return optionalAverage.getAsDouble();
        }else {
            return 0.0;
        }
    }
}
