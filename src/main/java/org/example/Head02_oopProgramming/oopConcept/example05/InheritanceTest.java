package org.example.Head02_oopProgramming.oopConcept.example05;

public class InheritanceTest {
    public static void main(String[] args) {
        User u = new PersonalUser("U001", "KCH", "rnjscksdud17@gmail.com");
        u.printUserInfo();

        User b = new BusinessUser("U002", "Big show", "bigshow@gmail.com", "WWE");
        b.printUserInfo();
    }
}
