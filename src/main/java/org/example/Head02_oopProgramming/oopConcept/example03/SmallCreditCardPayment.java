package org.example.Head02_oopProgramming.oopConcept.example03;

public class SmallCreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("소액(신용카드) 결제: " + amount + "원");
    }
}
