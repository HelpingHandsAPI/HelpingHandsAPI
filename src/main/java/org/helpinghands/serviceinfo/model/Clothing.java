package org.helpinghands.serviceinfo.model;

import java.util.ArrayList;

public class Clothing extends Service{
    private ArrayList<String> typeOfClothing;

    public Clothing() {
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "typeOfClothing=" + typeOfClothing +
                "} " + super.toString();
    }

    public ArrayList<String> getTypeOfClothing() {
        return typeOfClothing;
    }

    public void setTypeOfClothing(ArrayList<String> typeOfClothing) {
        this.typeOfClothing = typeOfClothing;
    }
}
