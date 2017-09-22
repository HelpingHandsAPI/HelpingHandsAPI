package org.helpinghands.serviceinfo.domain;

public enum TypeOfFoodSvc {
    SOUP_KITCHEN, FOOD_PANTRY, DELIVERED_MEALS, NOT_APPLICABLE;

    private String typeOfFoodSvc;

    public String getTypeOfFoodSvc() {
        return typeOfFoodSvc;
    }

    public void setTypeOfFoodSvc(String typeOfFoodSvc) {
        this.typeOfFoodSvc = typeOfFoodSvc;
    }

    @Override
    public String toString() {
        return "TypeOfFoodSvc{" +
                "typeOfFoodSvc='" + typeOfFoodSvc + '\'' +
                "} " + super.toString();
    }
}
