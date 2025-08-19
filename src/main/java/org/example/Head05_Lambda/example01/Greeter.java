package org.example.Head05_Lambda.example01;

public class Greeter {
    private final String prefix; // 상태를 가질 수 있음

    public Greeter(String prefix) {
        this.prefix = prefix;
    }

    public void greet(String name) { // 메서드 여러개 가능
        System.out.println(prefix + " " + name);
    }

}
