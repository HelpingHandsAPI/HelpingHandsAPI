package org.helpinghands.serviceinfo.model;

import java.util.ArrayList;

public class TransitionalHousing extends Service {
    private ArrayList<String> typeOfShelter;
    private ArrayList<String> specialServicesProvided;
    private ArrayList<String> specialRules;
    private ArrayList<String> specialRequirementsNotes;
    private ArrayList<String> tbTestRequirements;

    public TransitionalHousing() {
    }

    @Override
    public String toString() {
        return "TransitionalHousing{" +
                "typeOfShelter=" + typeOfShelter +
                ", specialServicesProvided=" + specialServicesProvided +
                ", specialRules=" + specialRules +
                ", specialRequirementsNotes=" + specialRequirementsNotes +
                ", tbTestRequirements=" + tbTestRequirements +
                "} " + super.toString();
    }

    public ArrayList<String> getTypeOfShelter() {
        return typeOfShelter;
    }

    public void setTypeOfShelter(ArrayList<String> typeOfShelter) {
        this.typeOfShelter = typeOfShelter;
    }

    public ArrayList<String> getSpecialServicesProvided() {
        return specialServicesProvided;
    }

    public void setSpecialServicesProvided(ArrayList<String> specialServicesProvided) {
        this.specialServicesProvided = specialServicesProvided;
    }

    public ArrayList<String> getSpecialRules() {
        return specialRules;
    }

    public void setSpecialRules(ArrayList<String> specialRules) {
        this.specialRules = specialRules;
    }

    public ArrayList<String> getSpecialRequirementsNotes() {
        return specialRequirementsNotes;
    }

    public void setSpecialRequirementsNotes(ArrayList<String> specialRequirementsNotes) {
        this.specialRequirementsNotes = specialRequirementsNotes;
    }

    public ArrayList<String> getTbTestRequirements() {
        return tbTestRequirements;
    }

    public void setTbTestRequirements(ArrayList<String> tbTestRequirements) {
        this.tbTestRequirements = tbTestRequirements;
    }
}
