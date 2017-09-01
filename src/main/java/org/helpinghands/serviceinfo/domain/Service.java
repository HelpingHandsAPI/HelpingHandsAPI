package org.helpinghands.serviceinfo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "Service")
public class Service {

    private ServiceProvider serviceProvider;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceID;

    @Column(name = "ServiceName")
    private Enum TypeOfService;

    @Column(name = "CommunityServed")
    private Enum TypeOfCommunity;

    @Column(name = "FoodService")
    private Enum TypeOfFoodSvc;

    @Column(name = "HealthService")
    private Enum TypeOfHealthSvc;

    @Column(name = "TypeOfClothing")
    private Enum TypeOfClothingCloset;

    @Column(name = "Eligibility")
    private String eligibility;

    @Column(name = "RequiredDocuments")
    private String reqDocuments;

    @Column(name = "IntakeProcedure")
    private String intakeProcedure;

    @Column(name = "TimePlace")
    private String timePlaceInfo;

    @Column(name = "HoursOfOperation")
    private String facilityHoursOfOper;

    @Column(name = "SpecialDetails")
    private String specialDetails;

    @Column(name = "Fees")
    private boolean possibleFees;

//    static final int COMMUNITY_SERVED_MEN = 1;
//    static final int communityServedMenChildren = 2;
//    static final int communityServedWomen = 4;
//    static final int communityServedWomenChildren = 8;
//    static final int communityServedVeteransOnly = 16;
//    static final int communityServedHomelessOnly = 32;
//    static final int communityServedOther = 64;

    public Service() {
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public Enum getTypeOfService() {
        return TypeOfService;
    }

    public void setTypeOfService(Enum typeOfService) {
        TypeOfService = typeOfService;
    }

    public Enum getTypeOfCommunity() {
        return TypeOfCommunity;
    }

    public void setTypeOfCommunity(Enum typeOfCommunity) {
        TypeOfCommunity = typeOfCommunity;
    }

    public Enum getTypeOfFoodSvc() {
        return TypeOfFoodSvc;
    }

    public void setTypeOfFoodSvc(Enum typeOfFoodSvc) {
        TypeOfFoodSvc = typeOfFoodSvc;
    }

    public Enum getTypeOfHealthSvc() {
        return TypeOfHealthSvc;
    }

    public void setTypeOfHealthSvc(Enum typeOfHealthSvc) {
        TypeOfHealthSvc = typeOfHealthSvc;
    }

    public Enum getTypeOfClothingCloset() {
        return TypeOfClothingCloset;
    }

    public void setTypeOfClothingCloset(Enum typeOfClothingCloset) {
        TypeOfClothingCloset = typeOfClothingCloset;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public String getReqDocuments() {
        return reqDocuments;
    }

    public void setReqDocuments(String reqDocuments) {
        this.reqDocuments = reqDocuments;
    }

    public String getIntakeProcedure() {
        return intakeProcedure;
    }

    public void setIntakeProcedure(String intakeProcedure) {
        this.intakeProcedure = intakeProcedure;
    }

    public String getTimePlaceInfo() {
        return timePlaceInfo;
    }

    public void setTimePlaceInfo(String timePlaceInfo) {
        this.timePlaceInfo = timePlaceInfo;
    }

    public String getFacilityHoursOfOper() {
        return facilityHoursOfOper;
    }

    public void setFacilityHoursOfOper(String facilityHoursOfOper) {
        this.facilityHoursOfOper = facilityHoursOfOper;
    }

    public String getSpecialDetails() {
        return specialDetails;
    }

    public void setSpecialDetails(String specialDetails) {
        this.specialDetails = specialDetails;
    }

    public boolean isPossibleFees() {
        return possibleFees;
    }

    public void setPossibleFees(boolean possibleFees) {
        this.possibleFees = possibleFees;
    }


    @Override
    public String toString() {
        return "Service{" +
                ", serviceID=" + serviceID +
                ", TypeOfService=" + TypeOfService +
                ", TypeOfCommunity=" + TypeOfCommunity +
                ", TypeOfFoodSvc=" + TypeOfFoodSvc +
                ", TypeOfHealthSvc=" + TypeOfHealthSvc +
                ", TypeOfClothingCloset=" + TypeOfClothingCloset +
                ", eligibility=" + eligibility +
                ", reqDocuments=" + reqDocuments +
                ", intakeProcedure=" + intakeProcedure +
                ", timePlaceInfo=" + timePlaceInfo +
                ", facilityHoursOfOper=" + facilityHoursOfOper +
                ", specialDetails=" + specialDetails +
                ", possibleFees=" + possibleFees +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Service)) return false;

        Service service = (Service) o;

        if (getServiceID() != service.getServiceID()) return false;
        if (isPossibleFees() != service.isPossibleFees()) return false;
        if (!getServiceProvider().equals(service.getServiceProvider())) return false;
        if (!getTypeOfService().equals(service.getTypeOfService())) return false;
        if (!getTypeOfCommunity().equals(service.getTypeOfCommunity())) return false;
        if (!getTypeOfFoodSvc().equals(service.getTypeOfFoodSvc())) return false;
        if (!getTypeOfHealthSvc().equals(service.getTypeOfHealthSvc())) return false;
        if (!getTypeOfClothingCloset().equals(service.getTypeOfClothingCloset())) return false;
        if (!getEligibility().equals(service.getEligibility())) return false;
        if (!getReqDocuments().equals(service.getReqDocuments())) return false;
        if (!getIntakeProcedure().equals(service.getIntakeProcedure())) return false;
        if (!getTimePlaceInfo().equals(service.getTimePlaceInfo())) return false;
        if (!getFacilityHoursOfOper().equals(service.getFacilityHoursOfOper())) return false;
        return getSpecialDetails() != null ? getSpecialDetails().equals(service.getSpecialDetails()) : service.getSpecialDetails() == null;
    }

    @Override
    public int hashCode() {
        int result = getServiceProvider().hashCode();
        result = 31 * result + getServiceID();
        result = 31 * result + getTypeOfService().hashCode();
        result = 31 * result + getTypeOfCommunity().hashCode();
        result = 31 * result + getTypeOfFoodSvc().hashCode();
        result = 31 * result + getTypeOfHealthSvc().hashCode();
        result = 31 * result + getTypeOfClothingCloset().hashCode();
        result = 31 * result + getEligibility().hashCode();
        result = 31 * result + getReqDocuments().hashCode();
        result = 31 * result + getIntakeProcedure().hashCode();
        result = 31 * result + getTimePlaceInfo().hashCode();
        result = 31 * result + getFacilityHoursOfOper().hashCode();
        result = 31 * result + (getSpecialDetails() != null ? getSpecialDetails().hashCode() : 0);
        result = 31 * result + (isPossibleFees() ? 1 : 0);
        return result;
    }
}
