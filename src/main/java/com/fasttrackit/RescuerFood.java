package com.fasttrackit;

public class RescuerFood {
    private String name;
    private int price;
    private int decreaseHunger;

    public RescuerFood(String name, int price, int decreaseHunger) {
        this.name = name;
        this.price = price;
        this.decreaseHunger = decreaseHunger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDecreaseHunger() {
        return decreaseHunger;
    }

    public void setDecreaseHunger(int decreaseHunger) {
        this.decreaseHunger = decreaseHunger;
    }
}
