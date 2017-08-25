package org.helpinghands.serviceinfo.model;

import java.util.ArrayList;

public class RepresentativePayee {
    private ArrayList<String> areasServed;
    private String fees;

    public RepresentativePayee() {
    }

    @Override
    public String toString() {
        return "RepresentativePayee{" +
                "areasServed=" + areasServed +
                ", fees='" + fees + '\'' +
                '}';
    }

    public ArrayList<String> getAreasServed() {
        return areasServed;
    }

    public void setAreasServed(ArrayList<String> areasServed) {
        this.areasServed = areasServed;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }
}
