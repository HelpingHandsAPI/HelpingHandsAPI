package org.helpinghands.serviceinfo.model;

import java.util.ArrayList;

public class Healthcare extends Service{
    private ArrayList<String> insurance;
    private String feeStructure;
    private HealthService typeOfHealthcareSvc;
    private String specialNotes;

    public Healthcare() {
    }

    @Override
    public String toString() {
        return "Healthcare{" +
                "insurance=" + insurance +
                ", feeStructure='" + feeStructure + '\'' +
                ", typeOfHealthcareSvc=" + typeOfHealthcareSvc +
                ", specialNotes='" + specialNotes + '\'' +
                "} " + super.toString();
    }

    public ArrayList<String> getInsurance() {
        return insurance;
    }

    public void setInsurance(ArrayList<String> insurance) {
        this.insurance = insurance;
    }

    public String getFeeStructure() {
        return feeStructure;
    }

    public void setFeeStructure(String feeStructure) {
        this.feeStructure = feeStructure;
    }

    public HealthService getTypeOfHealthcareSvc() {
        return typeOfHealthcareSvc;
    }

    public void setTypeOfHealthcareSvc(HealthService typeOfHealthcareSvc) {
        this.typeOfHealthcareSvc = typeOfHealthcareSvc;
    }

    public String getSpecialNotes() {
        return specialNotes;
    }

    public void setSpecialNotes(String specialNotes) {
        this.specialNotes = specialNotes;
    }
}
