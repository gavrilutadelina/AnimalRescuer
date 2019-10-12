package com.fasttrackit;

public class Dog extends Animal {
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public void positiveMood(){
        System.out.println("The dog takes out the tongue");
    }
}
