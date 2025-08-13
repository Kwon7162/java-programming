package org.example.Head02_oopProgramming.oopConcept.example11;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printInstanceValue();
    }
}
