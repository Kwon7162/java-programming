package org.example.Head02_oopProgramming.oopConcept.example14;

public class LambdaDemo {
    public static void main(String[] args) {
        // Use Anonymous Class
        MyCalculator addAnon = new MyCalculator() {
            @Override
            public int operate(int x, int y) {
                return x + y;
            }
        };
        System.out.println("Anonymous Class: 3 + 5 = " + addAnon.operate(3, 5));

        // Use Lambda
        MyCalculator addLambda = (x, y) -> x + y;
        System.out.println("Lambda: 3 + 5 = " + addLambda.operate(3,5));
    }
}
