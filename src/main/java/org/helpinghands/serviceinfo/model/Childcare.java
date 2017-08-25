package org.helpinghands.serviceinfo.model;

import java.util.ArrayList;

public class Childcare extends Service {
    private ArrayList<String> activitiesProvided;
    private boolean snacksProvided;
    private boolean mealsProvided;

    public Childcare() {
    }

    @Override
    public String toString() {
        return "Childcare{" +
                "activitiesProvided=" + activitiesProvided +
                ", snacksProvided=" + snacksProvided +
                ", mealsProvided=" + mealsProvided +
                "} " + super.toString();
    }

    public ArrayList<String> getActivitiesProvided() {
        return activitiesProvided;
    }

    public void setActivitiesProvided(ArrayList<String> activitiesProvided) {
        this.activitiesProvided = activitiesProvided;
    }

    public boolean isSnacksProvided() {
        return snacksProvided;
    }

    public void setSnacksProvided(boolean snacksProvided) {
        this.snacksProvided = snacksProvided;
    }

    public boolean isMealsProvided() {
        return mealsProvided;
    }

    public void setMealsProvided(boolean mealsProvided) {
        this.mealsProvided = mealsProvided;
    }
}
