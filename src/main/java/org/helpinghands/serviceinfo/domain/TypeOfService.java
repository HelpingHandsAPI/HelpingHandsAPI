package org.helpinghands.serviceinfo.domain;

public enum TypeOfService {
    CHILDCARE,
    CLOTHING,
    FOOD,
    HEALTHCARE,
    ID_DOCUMENT,
    JOB_TRAINING,
    LEGAL,
    PERMANENT_HOUSING,
    REPRESENTATIVE_PAYEE, //Org. or person that has power of attorney for client and receives their SS or disablility www
    TEMP_MAILBOX,
    TRANSITIONAL_HOUSING,
    TRANSPORTATION;

    private String specificServiceName;

    public String getSpecificServiceName() {
        return specificServiceName;
    }

    public void setSpecificServiceName(String specificServiceName) {
        this.specificServiceName = specificServiceName;
    }

    @Override
    public String toString() {
        return "TypeOfService{" +
                "specificServiceName='" + specificServiceName + '\'' +
                "} " + super.toString();
    }
}
