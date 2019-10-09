package com.fasttrackit;

public class Rescuer extends Entity {
    private double money;
    private int mood;
    private String rescuerFavoriteActivity;
    private String rescuerFavoriteFood;

    public void AnimalFeed(Animal animal, AnimalFood animalFood) {
        System.out.println(getName() + " just gave some " + animalFood.getName() + " food to " + animal.getName() + ".");
    }

    public void RecreationalActivity(Animal animal, Activity activity) {
        System.out.println(getName() + " have some " + activity.getName() + " activity with " + animal.getName() + ". ");
    }

    public Rescuer(String name, int age) {
        super.setName(name);
        super.setAge(age);
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public String getRescuerFavoriteActivity() {
        return rescuerFavoriteActivity;
    }

    public void setRescuerFavoriteActivity(String rescuerFavoriteActivity) {
        this.rescuerFavoriteActivity = rescuerFavoriteActivity;
    }

    public String getRescuerFavoriteFood() {
        return rescuerFavoriteFood;
    }

    public void setRescuerFavoriteFood(String rescuerFavoriteFood) {
        this.rescuerFavoriteFood = rescuerFavoriteFood;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
