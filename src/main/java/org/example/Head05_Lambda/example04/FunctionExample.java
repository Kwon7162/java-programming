package org.example.Head05_Lambda.example04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunc = str -> str.length();
        System.out.println(lengthFunc.apply("Hello")); // 5

        //Stream API map() 동작
        List<String> words = Arrays.asList("Hi", "Hello", "World");
        words.stream()
                .map(lengthFunc) // 내부적으로 lengthFunc.apply(x)
                .forEach(System.out::println); // 2, 5, 5
    }
}
