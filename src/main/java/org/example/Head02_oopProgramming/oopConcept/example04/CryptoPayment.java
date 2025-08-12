package org.example.Head02_oopProgramming.oopConcept.example04;

public class CryptoPayment extends AbstractPayment{
    @Override
    public void pay(double amount) {
        System.out.println("가상화폐로 " + amount + "원 결제 완료.");
    }
}
