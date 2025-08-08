package org.example.Head01_JavaProgramming.example05;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) continue; //짝수 거르기
            System.out.println(i); // 홀수만 출력
        }
    }
}