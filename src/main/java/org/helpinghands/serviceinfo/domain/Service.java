package org.helpinghands.serviceinfo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "Service")
public class Service {

//    private ServiceProvider serviceProvider;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceID;

    @Column(name = "ServiceName")
    private Enum TypeOfService;

    @Column
    private int providerID;

    @ManyToOne
    @JoinColumn(name="ProviderID")
    private ServiceProvider serviceProvider;

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

    public int getProviderID() {
        return providerID;
    }

    public void setProviderID(int providerID) {
        this.providerID = providerID;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Service)) return false;

        Service service = (Service) o;

        if (getProviderID() != service.getProviderID()) return false;
        if (isPossibleFees() != service.isPossibleFees()) return false;
        if (!getTypeOfService().equals(service.getTypeOfService())) return false;
        if (!getServiceProvider().equals(service.getServiceProvider())) return false;
        if (getTypeOfCommunity() != null ? !getTypeOfCommunity().equals(service.getTypeOfCommunity()) : service.getTypeOfCommunity() != null)
            return false;
        if (getTypeOfFoodSvc() != null ? !getTypeOfFoodSvc().equals(service.getTypeOfFoodSvc()) : service.getTypeOfFoodSvc() != null)
            return false;
        if (getTypeOfHealthSvc() != null ? !getTypeOfHealthSvc().equals(service.getTypeOfHealthSvc()) : service.getTypeOfHealthSvc() != null)
            return false;
        if (getTypeOfClothingCloset() != null ? !getTypeOfClothingCloset().equals(service.getTypeOfClothingCloset()) : service.getTypeOfClothingCloset() != null)
            return false;
        if (getEligibility() != null ? !getEligibility().equals(service.getEligibility()) : service.getEligibility() != null)
            return false;
        if (getReqDocuments() != null ? !getReqDocuments().equals(service.getReqDocuments()) : service.getReqDocuments() != null)
            return false;
        if (getIntakeProcedure() != null ? !getIntakeProcedure().equals(service.getIntakeProcedure()) : service.getIntakeProcedure() != null)
            return false;
        if (getTimePlaceInfo() != null ? !getTimePlaceInfo().equals(service.getTimePlaceInfo()) : service.getTimePlaceInfo() != null)
            return false;
        if (getFacilityHoursOfOper() != null ? !getFacilityHoursOfOper().equals(service.getFacilityHoursOfOper()) : service.getFacilityHoursOfOper() != null)
            return false;
        return getSpecialDetails() != null ? getSpecialDetails().equals(service.getSpecialDetails()) : service.getSpecialDetails() == null;
    }

    @Override
    public int hashCode() {
        int result = getTypeOfService().hashCode();
        result = 31 * result + getProviderID();
        result = 31 * result + getServiceProvider().hashCode();
        result = 31 * result + (getTypeOfCommunity() != null ? getTypeOfCommunity().hashCode() : 0);
        result = 31 * result + (getTypeOfFoodSvc() != null ? getTypeOfFoodSvc().hashCode() : 0);
        result = 31 * result + (getTypeOfHealthSvc() != null ? getTypeOfHealthSvc().hashCode() : 0);
        result = 31 * result + (getTypeOfClothingCloset() != null ? getTypeOfClothingCloset().hashCode() : 0);
        result = 31 * result + (getEligibility() != null ? getEligibility().hashCode() : 0);
        result = 31 * result + (getReqDocuments() != null ? getReqDocuments().hashCode() : 0);
        result = 31 * result + (getIntakeProcedure() != null ? getIntakeProcedure().hashCode() : 0);
        result = 31 * result + (getTimePlaceInfo() != null ? getTimePlaceInfo().hashCode() : 0);
        result = 31 * result + (getFacilityHoursOfOper() != null ? getFacilityHoursOfOper().hashCode() : 0);
        result = 31 * result + (getSpecialDetails() != null ? getSpecialDetails().hashCode() : 0);
        result = 31 * result + (isPossibleFees() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceID=" + serviceID +
                ", TypeOfService=" + TypeOfService +
                ", providerID=" + providerID +
                ", serviceProvider=" + serviceProvider +
                ", TypeOfCommunity=" + TypeOfCommunity +
                ", TypeOfFoodSvc=" + TypeOfFoodSvc +
                ", TypeOfHealthSvc=" + TypeOfHealthSvc +
                ", TypeOfClothingCloset=" + TypeOfClothingCloset +
                ", eligibility='" + eligibility + '\'' +
                ", reqDocuments='" + reqDocuments + '\'' +
                ", intakeProcedure='" + intakeProcedure + '\'' +
                ", timePlaceInfo='" + timePlaceInfo + '\'' +
                ", facilityHoursOfOper='" + facilityHoursOfOper + '\'' +
                ", specialDetails='" + specialDetails + '\'' +
                ", possibleFees=" + possibleFees +
                '}';
    }
}
