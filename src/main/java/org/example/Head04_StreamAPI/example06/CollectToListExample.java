package org.example.Head04_StreamAPI.example06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToListExample {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("a", "b", "c", "b");

        // TODO 구현
        List<String> result = data.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Result list: " + result);
    }
}
