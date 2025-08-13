package org.example.Head02_oopProgramming.oopConcept.example13;

public class AnonymousClassExample {
    public static void main(String[] args) {
        // Use Anonymous Class
        EventListener listener = new EventListener() {
            @Override
            public void onEvent(String eventData) {
                System.out.println("이벤트 발생: " + eventData);
            }
        };

        simulateEvent("USER_LOGIN", listener);
    }

    public static void simulateEvent(String eventData, EventListener listener) {
        listener.onEvent(eventData);
    }
}
