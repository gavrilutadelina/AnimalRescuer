package com.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Rescuer rescuer = new Rescuer("Mihai", 45);
        rescuer.setMoney(1200);

        Animal dog = new Animal("Lola", 3, "black");
        dog.setFavouriteActivity("Forest Walks");
        dog.setFavouriteFood("Royal Canin");
        dog.setHealthLevel(7);
        dog.setHealthLevel(8);
        dog.setMoodLevel(9);

        Doctor doctor = new Doctor("John", "DogConsult", 150);
        doctor.setAge(42);
        doctor.setSuggestMedicalTreatment("Dog Food");

        Game game = new Game(rescuer, dog);
        game.setDoctor(doctor);
        game.setDog(dog);
        game.setRescuer(rescuer);

        AnimalFood dogFood = new AnimalFood("Fish", 37, 3);
        dogFood.setAvailabilyInStock(155);
        dogFood.setCantity(400);
        dogFood.setExpirationDate("20 ianuarie 2020");
        dogFood.setIncreaseHealth(5);
        dogFood.setMedicalTreatment(true);

        Activity forestWalks = new Activity("Forest Walks", 7);
        forestWalks.setIncreaseAnimalMood(10);
        forestWalks.setIncreaseRescuerlMood(10);
        forestWalks.setPrice(10);

        RescuerFood pizza = new RescuerFood("Capriciosa", 17, 10);

        rescuer.AnimalFeed(dog, dogFood);
        rescuer.RecreationalActivity(dog, forestWalks);

    }
}
