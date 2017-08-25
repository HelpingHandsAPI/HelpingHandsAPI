package org.helpinghands.serviceinfo.model;

import java.util.ArrayList;

public class TemporaryMailAddress {
    private ArrayList<String> specialRequirements;

    public TemporaryMailAddress() {
    }

    @Override
    public String toString() {
        return "TemporaryMailAddress{" +
                "specialRequirements=" + specialRequirements +
                '}';
    }

    public ArrayList<String> getSpecialRequirements() {
        return specialRequirements;
    }

    public void setSpecialRequirements(ArrayList<String> specialRequirements) {
        this.specialRequirements = specialRequirements;
    }
}
