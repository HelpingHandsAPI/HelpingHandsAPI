package org.helpinghands.serviceinfo.model;

import java.util.ArrayList;

public class LegalServices extends Service {
    private ArrayList<String> legalServicesProvided;
    private ArrayList<String> specialPrograms;

    public LegalServices() {
    }

    @Override
    public String toString() {
        return "LegalServices{" +
                "legalServicesProvided=" + legalServicesProvided +
                ", specialPrograms=" + specialPrograms +
                "} " + super.toString();
    }

    public ArrayList<String> getLegalServicesProvided() {
        return legalServicesProvided;
    }

    public void setLegalServicesProvided(ArrayList<String> legalServicesProvided) {
        this.legalServicesProvided = legalServicesProvided;
    }

    public ArrayList<String> getSpecialPrograms() {
        return specialPrograms;
    }

    public void setSpecialPrograms(ArrayList<String> specialPrograms) {
        this.specialPrograms = specialPrograms;
    }
}
