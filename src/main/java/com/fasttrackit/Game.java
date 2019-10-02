package com.fasttrackit;

public class Game {
    private Rescuer rescuer;
    private Doctor doctor;
    private Animal dog;
//    MedicalTreatment medicalTreatment;
//    AnimalFood dogFood;
//    Activity forestWalks;

    public Game(Rescuer rescuer, Animal dog) {
        this.rescuer = rescuer;
        this.dog = dog;
    }

    public Rescuer getRescuer() {
        return rescuer;
    }

    public void setRescuer(Rescuer rescuer) {
        this.rescuer = rescuer;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Animal getDog() {
        return dog;
    }

    public void setDog(Animal dog) {
        this.dog = dog;
    }
}
