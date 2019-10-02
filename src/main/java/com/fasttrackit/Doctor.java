package com.fasttrackit;

public class Doctor extends Entity {
    private String specialization;
    private int consultationPrice;
    private String suggestMedicalTreatment;

    public Doctor(String name, String specialization, int consultationPrice) {
        super.setName(name);
        this.specialization = specialization;
        this.consultationPrice = consultationPrice;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getConsultationPrice() {
        return consultationPrice;
    }

    public void setConsultationPrice(int consultationPrice) {
        this.consultationPrice = consultationPrice;
    }

    public String getSuggestMedicalTreatment() {
        return suggestMedicalTreatment;
    }

    public void setSuggestMedicalTreatment(String suggestMedicalTreatment) {
        this.suggestMedicalTreatment = suggestMedicalTreatment;
    }
}
