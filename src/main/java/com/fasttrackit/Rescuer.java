package com.fasttrackit;

import java.util.Scanner;

public class Rescuer extends Entity {
    private double money;
    private int mood;
    private int animalFoodCantity;
    private String rescuerFavoriteActivity;
    private String rescuerFavoriteFood;
    Scanner in = new Scanner(System.in);


    public void AnimalFeed(Animal animal, AnimalFood animalFood) {
        if (animalFoodCantity > 0) {
            animalFoodCantity = animalFoodCantity - 1;
            animal.setHungerLevel(animal.getHungerLevel() - animalFood.getDecreaseHunger());
            if (animalFood.isMedicalTreatment()) animal.setHealthLevel(animal.getHealthLevel() + 1);
        }
//        else {
//            System.out.println("You don't have enought food!\nDo you want to buy food?\n1.Yes       2.No");
//            int buyFoodChoise = in.nextInt();
//            if (buyFoodChoise==1) {
//
//
//                buyFood();}
//            else System.out.println("You have choosen to not buy food.");
//        }
        System.out.println(getName() + " just gave some " + animalFood.getName() + " food to " + animal.getName() + ".");
        System.out.println(animal.getName()+"'s hunger level: "+animal.getHungerLevel());
    }

//    public void buyFood(){
//        animalFoodCantity=animalFoodCantity+7;
//        money=money-a
//    }

    public void RecreationalActivity(Animal animal, Activity activity) {
        animal.setMoodLevel(animal.getMoodLevel()+activity.getIncreaseAnimalMood());
        if(activity.getPrice()>0)money=money-activity.getPrice();
        System.out.println(getName() + " have some " + activity.getName() + " activity with " + animal.getName() + ". ");
        System.out.println(animal.getName()+"'s mood level: "+animal.getMoodLevel());
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
//
//    public int getFoodCantity() {
//        return foodCantity;
//    }
//
//    public void setFoodCantity(int cantity) {
//        this.foodCantity = cantity;
//    }

}
