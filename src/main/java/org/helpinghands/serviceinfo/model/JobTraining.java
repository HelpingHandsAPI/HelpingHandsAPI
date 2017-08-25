package org.helpinghands.serviceinfo.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class JobTraining extends Service {
    private ArrayList<String> typeOfTraining;
    private ArrayList<String> trainingHours;
    private ArrayList<String> requirements;

    public JobTraining() {
    }

    @Override
    public String toString() {
        return "JobTraining{" +
                "typeOfTraining=" + typeOfTraining +
                ", trainingHours=" + trainingHours +
                ", requirements=" + requirements +
                "} " + super.toString();
    }

    public ArrayList<String> getTypeOfTraining() {
        return typeOfTraining;
    }

    public void setTypeOfTraining(ArrayList<String> typeOfTraining) {
        this.typeOfTraining = typeOfTraining;
    }

    public ArrayList<String> getTrainingHours() {
        return trainingHours;
    }

    public void setTrainingHours(ArrayList<String> trainingHours) {
        this.trainingHours = trainingHours;
    }

    public ArrayList<String> getRequirements() {
        return requirements;
    }

    public void setRequirements(ArrayList<String> requirements) {
        this.requirements = requirements;
    }
}
