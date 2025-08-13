package org.example.Head02_oopProgramming.oopConcept.example16;

public class EnumBasicTest {
    public enum Level {
        LOW, MEDIUM, HIGH
    }

    public static void main(String[] args) {
        for (Level lv1 : Level.values()) {
            System.out.println(lv1 + " ordinal: " + lv1.ordinal());
        }
        Level today = Level.MEDIUM;
        System.out.println("name(): " + today.name());
    }

}
