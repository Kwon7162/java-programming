package org.example.Head02_oopProgramming.oopConcept.example04;

public abstract class AbstractPayment {
    public  abstract void pay(double amount);

    public void cancel(double amount){
        System.out.println("결제 취소: " + amount + "원");
    }
}
