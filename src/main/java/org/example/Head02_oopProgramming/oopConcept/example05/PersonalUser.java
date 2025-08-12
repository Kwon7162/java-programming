package org.example.Head02_oopProgramming.oopConcept.example05;

public class PersonalUser extends User {
    private String email;

    public PersonalUser(String id, String name, String mail) {
        super(id, name);
        this.email = mail;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("이메일: " + email);
    }
}
