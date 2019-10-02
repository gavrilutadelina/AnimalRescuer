package com.fasttrackit;

public class AnimalCareCenter {
    private String name;
    private double price;
    private int newCareLevel;
    private int increaseMood;

    public AnimalCareCenter(String name, double price, int increaseMood) {
        this.name = name;
        this.price = price;
        this.increaseMood = increaseMood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNewCareLevel() {
        return newCareLevel;
    }

    public void setNewCareLevel(int newCareLevel) {
        this.newCareLevel = newCareLevel;
    }

    public int getIncreaseMood() {
        return increaseMood;
    }

    public void setIncreaseMood(int increaseMood) {
        this.increaseMood = increaseMood;
    }
}