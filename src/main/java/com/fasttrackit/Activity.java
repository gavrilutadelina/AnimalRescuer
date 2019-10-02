package com.fasttrackit;

public class Activity {
    private String name;
    private int increaseAnimalMood;
    private int increaseRescuerlMood;
    private int price;
    private int increaseHealth;

    public Activity(String name, int increaseHealth) {
        this.name = name;
        this.increaseHealth = increaseHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncreaseAnimalMood() {
        return increaseAnimalMood;
    }

    public void setIncreaseAnimalMood(int increaseAnimalMood) {
        this.increaseAnimalMood = increaseAnimalMood;
    }

    public int getIncreaseRescuerlMood() {
        return increaseRescuerlMood;
    }

    public void setIncreaseRescuerlMood(int increaseRescuerlMood) {
        this.increaseRescuerlMood = increaseRescuerlMood;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIncreaseHealth() {
        return increaseHealth;
    }

    public void setIncreaseHealth(int increaseHealth) {
        this.increaseHealth = increaseHealth;
    }
}