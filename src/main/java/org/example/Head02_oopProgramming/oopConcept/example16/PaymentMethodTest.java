package org.example.Head02_oopProgramming.oopConcept.example16;

public class PaymentMethodTest {
    public static void main(String[] args) {
        for(PaymentMethod method : PaymentMethod.values()) {
            System.out.println(method.name() + " => " + method.getDisplayName());
        }
    }
}
