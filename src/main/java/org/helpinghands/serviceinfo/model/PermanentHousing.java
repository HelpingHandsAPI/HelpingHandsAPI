package org.helpinghands.serviceinfo.model;

import java.util.ArrayList;

public class PermanentHousing extends Service{
    private boolean areasServed;
    private ArrayList<String> typeOfHousingService;
    private  ArrayList<String> specialRequirements;

    public PermanentHousing() {
    }

    @Override
    public String toString() {
        return "PermanentHousing{" +
                "areasServed=" + areasServed +
                ", typeOfHousingService=" + typeOfHousingService +
                ", specialRequirements=" + specialRequirements +
                '}';
    }

    public boolean isAreasServed() {
        return areasServed;
    }

    public void setAreasServed(boolean areasServed) {
        this.areasServed = areasServed;
    }

    public ArrayList<String> getTypeOfHousingService() {
        return typeOfHousingService;
    }

    public void setTypeOfHousingService(ArrayList<String> typeOfHousingService) {
        this.typeOfHousingService = typeOfHousingService;
    }

    public ArrayList<String> getSpecialRequirements() {
        return specialRequirements;
    }

    public void setSpecialRequirements(ArrayList<String> specialRequirements) {
        this.specialRequirements = specialRequirements;
    }
}
