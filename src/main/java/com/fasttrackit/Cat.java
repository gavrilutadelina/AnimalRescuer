package com.fasttrackit;

public class Cat extends Animal {
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    public void positiveMood(){
        System.out.println("The cat purrs.");
    }
}
