package org.example.Head02_oopProgramming.oopConcept.example15;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        //abstract class with anonymous
        AbstractTask customTask = new AbstractTask() {
            @Override
            public void execute() {
                System.out.println("추상 클래스의 execute() 구현부");
            }

            @Override
            public void start() {
                System.out.println("Task Start change");
            }
        };

        customTask.start();
        customTask.execute();
    }
}
