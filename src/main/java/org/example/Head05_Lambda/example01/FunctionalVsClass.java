package org.example.Head05_Lambda.example01;

public class FunctionalVsClass {
    public static void main(String[] args) {
        // 일반 클래스 사용
        Greeter greeter = new Greeter("Hello");
        greeter.greet("Kim"); // 상태(prefix)를 내부에 유지 가능

        //함수형 인터페이스 구현체 1 - 익명 클래스
        StringAction printUpper1 = new StringAction() {
            @Override
            public void run(String input) {
                System.out.println(input.toUpperCase());
            }
        };

        //함수형 인터페이스 구현체 2 - 람다
        StringAction printUpper2 = s -> System.out.println(s.toUpperCase());

        printUpper1.run("hello");
        printUpper2.run("world");
    }
}
