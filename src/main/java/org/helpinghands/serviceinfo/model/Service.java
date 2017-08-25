package org.helpinghands.serviceinfo.model;

import java.util.ArrayList;;
import java.util.Set;

public class Service {
    private int serviceID;
    private Set<Service> serviceType;
    private Set<String> documentNeeded;
    private Set<String> eligibility;
    private ArrayList<String> hoursOfOperation;
    private ArrayList<String> intakeProcedure;
    static final int communityServedMen = 1;
    static final int communityServedMenChildren = 2;
    static final int communityServedWomen = 4;
    static final int communityServedWomenChildren = 8;
    static final int communityServedVeteransOnly = 16;
    static final int communityServedHomelessOnly = 32;
    static final int communityServedOther = 64;

    public Service() {
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceID=" + serviceID +
                ", serviceType=" + serviceType +
                ", documentNeeded=" + documentNeeded +
                ", eligibility=" + eligibility +
                ", hoursOfOperation=" + hoursOfOperation +
                ", intakeProcedure=" + intakeProcedure +
                '}';
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public Set<Service> getServiceType() {
        return serviceType;
    }

    public void setServiceType(Set<Service> serviceType) {
        this.serviceType = serviceType;
    }

    public Set<String> getDocumentNeeded() {
        return documentNeeded;
    }

    public void setDocumentNeeded(Set<String> documentNeeded) {
        this.documentNeeded = documentNeeded;
    }

    public Set<String> getEligibility() {
        return eligibility;
    }

    public void setEligibility(Set<String> eligibility) {
        this.eligibility = eligibility;
    }

    public ArrayList<String> getHoursOfOperation() {
        return hoursOfOperation;
    }

    public void setHoursOfOperation(ArrayList<String> hoursOfOperation) {
        this.hoursOfOperation = hoursOfOperation;
    }

    public ArrayList<String> getIntakeProcedure() {
        return intakeProcedure;
    }

    public void setIntakeProcedure(ArrayList<String> intakeProcedure) {
        this.intakeProcedure = intakeProcedure;
    }

    public static int getCommunityServedMen() {
        return communityServedMen;
    }

    public static int getCommunityServedMenChildren() {
        return communityServedMenChildren;
    }

    public static int getCommunityServedWomen() {
        return communityServedWomen;
    }

    public static int getCommunityServedWomenChildren() {
        return communityServedWomenChildren;
    }

    public static int getCommunityServedVeteransOnly() {
        return communityServedVeteransOnly;
    }

    public static int getCommunityServedHomelessOnly() {
        return communityServedHomelessOnly;
    }

    public static int getCommunityServedOther() {
        return communityServedOther;
    }
}
