package org.example.Head04_StreamAPI.example05;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
