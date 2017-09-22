package org.helpinghands.serviceinfo.domain;

public enum TypeOfCommunity {
    SINGLE_MEN, MEN_CHILDREN, SINGLE_WOMEN, WOMEN_CHILDREN, ALL, NOT_APPLICABLE;

    private String typeOfCommunity;

    public String getTypeOfCommunity() {
        return typeOfCommunity;
    }

    public void setTypeOfCommunity(String typeOfCommunity) {
        this.typeOfCommunity = typeOfCommunity;
    }

    @Override
    public String toString() {
        return "TypeOfCommunity{" +
                "typeOfCommunity='" + typeOfCommunity + '\'' +
                "} " + super.toString();
    }
}
