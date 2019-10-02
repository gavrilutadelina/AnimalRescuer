package com.fasttrackit;

import java.util.Date;

public class AnimalFood {
    private String name;
    private double price;
    private int availabilyInStock;
    private int cantity;
    private String expirationDate;
    private int decreaseHunger;
    private boolean medicalTreatment;
    private int increaseHealth;
    private int increaseMood;

    public AnimalFood(String name, double price, int decreaseHunger) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailabilyInStock() {
        return availabilyInStock;
    }

    public void setAvailabilyInStock(int availabilyInStock) {
        this.availabilyInStock = availabilyInStock;
    }

    public int getCantity() {
        return cantity;
    }

    public void setCantity(int cantity) {
        this.cantity = cantity;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getDecreaseHunger() {
        return decreaseHunger;
    }

    public void setDecreaseHunger(int decreaseHunger) {
        this.decreaseHunger = decreaseHunger;
    }

    public boolean isMedicalTreatment() {
        return medicalTreatment;
    }

    public void setMedicalTreatment(boolean medicalTreatment) {
        this.medicalTreatment = medicalTreatment;
    }

    public int getIncreaseHealth() {
        return increaseHealth;
    }

    public void setIncreaseHealth(int increaseHealth) {
        this.increaseHealth = increaseHealth;
    }

    public int getIncreaseMood() {
        return increaseMood;
    }

    public void setIncreaseMood(int increaseMood) {
        this.increaseMood = increaseMood;
    }
}
