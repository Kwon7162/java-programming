package org.example.Head02_oopProgramming.example05;

public class CoffeeMachine {
    private String model;
    private String color;
    private double weight;
    private double temperature;
    private String maker;
    private double amount;
    private boolean isOn;
    private double water;
    private String cleanDate;
    private double binAmount;
    private String coffee;
    private String coffeeType;
    private String steam;

    public CoffeeMachine(String model, String color, double temperature,
                         double weight, String maker, double amount, boolean isOn,
                         double water, String cleanDate, double binAmount,
                         String coffee, String coffeeType, String steam) {

        this.model = model;
        this.color = color;
        this.temperature = temperature;
        this.weight = weight;
        this.maker = maker;
        this.amount = amount;
        this.isOn = isOn;
        this.water = water;
        this.cleanDate = cleanDate;
        this.binAmount = binAmount;
        this.coffee = coffee;
        this.coffeeType = coffeeType;
        this.steam = steam;
    }

    public void chooseAmount(double amount) {
        this.amount = amount;
        System.out.println("용량 선택 "+ this.amount);
    }
    public void chooseTemper(double temperature) {
        this.temperature = temperature;
        System.out.println("온도 선택 "+ this.temperature);
    }
    public void addWater() {System.out.println("물 추가/빼기");}
    public void Steam() {System.out.println("스팀 추가/빼기");}

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", temperature=" + temperature +
                ", maker='" + maker + '\'' +
                ", amount=" + amount +
                ", isOn=" + isOn +
                ", water=" + water +
                ", cleanDate='" + cleanDate + '\'' +
                ", binAmount=" + binAmount +
                ", coffee='" + coffee + '\'' +
                ", coffeeType='" + coffeeType + '\'' +
                ", steam='" + steam + '\'' +
                '}';
    }
}
