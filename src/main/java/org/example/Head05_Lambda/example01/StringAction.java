package org.example.Head05_Lambda.example01;

// 함수형 인터페이스: 추상 메서드가 오직 하나인 인터페이스 SAM > Single Abstract Method
@FunctionalInterface
interface StringAction {
    // 추상 메서드가 단 하나만 있어야 함수형 인터페이스 성립
    void run(String input);

    // default/static 메서드는 몇 개 있어도 상관 없음 -> 메서드 숫자에 카운트되지 않음
    default void info() {
        System.out.println("[Info] StringAction default method");
    }
    static void help() {
        System.out.println("[Help] This is a helper.");
    }
}