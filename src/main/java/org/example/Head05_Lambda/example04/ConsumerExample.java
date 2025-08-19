package org.example.Head05_Lambda.example04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printer = s -> System.out.println("Consumed: " + s);
        printer.accept("Hello Consumer");

        //Stream API forEach() 동작
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream().forEach(printer);
        // Consumed: Alice
        // Consumed: Bob
        // Consumed: Charlie

    }
}
