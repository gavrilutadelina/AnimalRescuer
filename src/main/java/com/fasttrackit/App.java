package com.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Rescuer rescuer = new Rescuer();
        rescuer.setName("Mihai");
        rescuer.setMoney(1200);

        Animal dog = new Animal();
        dog.name = "Lola";
        dog.age=3;
        dog.favouriteActivity="forestWalks";
        dog.favouriteFood="RoyalCanin";
        dog.healthLevel=7;
        dog.hungerLevel=8;
        dog.moodLevel=9;

        Doctor doctor = new Doctor();
        doctor.name="John";
        doctor.specialization="DogConsult";

        Game game=new Game();

        AnimalFood dogFood = new AnimalFood();
        dogFood.availabilyInStock=5;
        dogFood.cantity=3;
        //dogFood.expirationDate=12.03.2020;
        dogFood.price=80;
        dogFood.name="RoyalCanin";

        Activity forestWalks=new Activity();
        forestWalks.name="ForestWalks";
        forestWalks.increaseAnimalMood=2;

        RescuerFood pizza = new RescuerFood();
        pizza.name="Pizza";
        pizza.price = 30;
        pizza.decreaseHunger=-2;






    }
}
