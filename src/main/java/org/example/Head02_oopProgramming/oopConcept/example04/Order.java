package org.example.Head02_oopProgramming.oopConcept.example04;

public class Order {
    private Payment payment;

    public Order(Payment payment) {
        this.payment = payment;
    }

    public void process(double amount) {
        payment.pay(amount);
    }
}
