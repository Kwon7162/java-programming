package org.example.Head05_Lambda.example04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(10)); // true
        System.out.println(isEven.test(11)); // false

        //Stream API filter() 동작
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        numbers.stream()
                .filter(isEven) // 내부적으로 isEven.test(n) 실행
                .forEach(System.out::println); // 2,4,6
    }
}
