package org.example.Head02_oopProgramming.example05;

import org.example.Head02_oopProgramming.example05.CoffeeMachine;

public class CoffeeMachineMain {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine("카누", "검정",
                80.0, 20, "카누", 100.0, true,
                100.0, "20250811", 75.0, "아라비카", "에티오피아",
                "스팀");

        coffeeMachine.chooseAmount(60);
        coffeeMachine.chooseTemper(70);
    }
}
