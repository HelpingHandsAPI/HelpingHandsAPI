package org.helpinghands.serviceinfo.domain;

public enum TypeOfHealthSvc {
    MEDICAL_CARE, DENTAL_CARE, VISION_CARE, MENTAL_HEALTH, NOT_APPLICABLE;

    private String typeOfHealthSvc;

    public String getTypeOfHealthSvc() {
        return typeOfHealthSvc;
    }

    public void setTypeOfHealthSvc(String typeOfHealthSvc) {
        this.typeOfHealthSvc = typeOfHealthSvc;
    }

    @Override
    public String toString() {
        return "TypeOfHealthSvc{" +
                "typeOfHealthSvc='" + typeOfHealthSvc + '\'' +
                "} " + super.toString();
    }
}
