package org.helpinghands.serviceinfo.domain;

public enum TypeOfClothingCloset {
    MENS_CLOTHING, WOMENS_CLOTHING, CHILDRENS_CLOTHING, BABY_CLOTHING, ALL_CLOTHING, NOT_APPLICABLE;

    private String typeOfClothing;

    public String getTypeOfClothingCloset() {
        return typeOfClothing;
    }

    public void setTypeOfClothingCloset(String typeOfClothingCloset) {
        this.typeOfClothing = typeOfClothingCloset;
    }

    @Override
    public String toString() {
        return "TypeOfClothingCloset{" +
                "typeOfClothing='" + typeOfClothing + '\'' +
                "} " + super.toString();
    }
}
