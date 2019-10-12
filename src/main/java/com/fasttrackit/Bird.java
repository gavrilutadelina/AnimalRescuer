package com.fasttrackit;

public class Bird extends Animal {
    public Bird(String name, int age, String color) {
        super(name, age, color);
    }

    public void positiveMood(){
        System.out.println("The bird sings beautifully");
    }
}
