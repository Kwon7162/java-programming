package org.example.Head01_JavaProgramming.example02;

public class TernaryExample {
    public static void main(String[] args) {
        int temperature = 31;
        String result = (temperature >= 32) ? "야외활동 통제" : "야외활동 가능";
        System.out.println("금일 작업: " + result);
    }
}