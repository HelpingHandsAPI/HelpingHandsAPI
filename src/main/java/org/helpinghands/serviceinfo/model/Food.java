package org.helpinghands.serviceinfo.model;

import java.util.ArrayList;

public class Food extends Service {
    private FoodService typeOfFoodService;
    private ArrayList<Integer> areasServed;
    private ArrayList<String> whenMealsAreProvided;
    private String specialNotes;

    public Food() {
    }

    @Override
    public String toString() {
        return "Food{" +
                "typeOfFoodService=" + typeOfFoodService +
                ", areasServed=" + areasServed +
                ", whenMealsAreProvided=" + whenMealsAreProvided +
                '}';
    }

    public FoodService getTypeOfFoodService() {
        return typeOfFoodService;
    }

    public void setTypeOfFoodService(FoodService typeOfFoodService) {
        this.typeOfFoodService = typeOfFoodService;
    }

    public ArrayList<Integer> getAreasServed() {
        return areasServed;
    }

    public void setAreasServed(ArrayList<Integer> areasServed) {
        this.areasServed = areasServed;
    }

    public ArrayList<String> getWhenMealsAreProvided() {
        return whenMealsAreProvided;
    }

    public void setWhenMealsAreProvided(ArrayList<String> whenMealsAreProvided) {
        this.whenMealsAreProvided = whenMealsAreProvided;
    }
}
