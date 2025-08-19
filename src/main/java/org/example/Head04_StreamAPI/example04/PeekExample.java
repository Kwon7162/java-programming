package org.example.Head04_StreamAPI.example04;

import java.util.Arrays;
import java.util.List;

public class PeekExample {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("one", "two", "three");

        // TODO 구현
        long count = items.stream()
                .peek(s -> System.out.println("[peek 1]" + s))
                .filter(s -> s.length() > 3)
                .peek(s -> System.out.println("[peek 2]" + s))
                .count();

        System.out.println("Count of filtered items: " + count);
    }
}
