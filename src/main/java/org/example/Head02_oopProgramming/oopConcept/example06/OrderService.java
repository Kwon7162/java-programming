package org.example.Head02_oopProgramming.oopConcept.example06;

public class OrderService {
    public void processPayment(Payment Method, double amount) {
        // Payment 인터페이스 기반으로 다형성 처리
        Method.pay(amount);
    }
}
