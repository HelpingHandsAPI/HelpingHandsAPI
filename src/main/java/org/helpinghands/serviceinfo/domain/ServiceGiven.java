package org.helpinghands.serviceinfo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table( name = "ServiceGiven")
public class ServiceGiven {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceID;

    @Column(name = "ServiceName")
    private Enum TypeOfService;

    @JsonIgnore
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

    public ServiceGiven() {
    }

    public ServiceGiven(int serviceID, Enum typeOfService, int providerID, Enum typeOfCommunity, Enum typeOfFoodSvc, Enum typeOfHealthSvc,
                        Enum typeOfClothingCloset, String eligibility, String reqDocuments, String intakeProcedure, String timePlaceInfo,
                        String facilityHoursOfOper, String specialDetails, boolean possibleFees) {
        super();
        this.serviceID = serviceID;
        TypeOfService = typeOfService;
        this.serviceProvider = new ServiceProvider(providerID);
        TypeOfCommunity = typeOfCommunity;
        TypeOfFoodSvc = typeOfFoodSvc;
        TypeOfHealthSvc = typeOfHealthSvc;
        TypeOfClothingCloset = typeOfClothingCloset;
        this.eligibility = eligibility;
        this.reqDocuments = reqDocuments;
        this.intakeProcedure = intakeProcedure;
        this.timePlaceInfo = timePlaceInfo;
        this.facilityHoursOfOper = facilityHoursOfOper;
        this.specialDetails = specialDetails;
        this.possibleFees = possibleFees;
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
        if (!(o instanceof ServiceGiven)) return false;

        ServiceGiven serviceGiven = (ServiceGiven) o;

        if (isPossibleFees() != serviceGiven.isPossibleFees()) return false;
        if (!getTypeOfService().equals(serviceGiven.getTypeOfService())) return false;
        if (!getServiceProvider().equals(serviceGiven.getServiceProvider())) return false;
        if (!getTypeOfCommunity().equals(serviceGiven.getTypeOfCommunity())) return false;
        if (!getTypeOfFoodSvc().equals(serviceGiven.getTypeOfFoodSvc())) return false;
        if (!getTypeOfHealthSvc().equals(serviceGiven.getTypeOfHealthSvc())) return false;
        if (!getTypeOfClothingCloset().equals(serviceGiven.getTypeOfClothingCloset())) return false;
        if (!getEligibility().equals(serviceGiven.getEligibility())) return false;
        if (!getReqDocuments().equals(serviceGiven.getReqDocuments())) return false;
        if (!getIntakeProcedure().equals(serviceGiven.getIntakeProcedure())) return false;
        if (!getTimePlaceInfo().equals(serviceGiven.getTimePlaceInfo())) return false;
        if (!getFacilityHoursOfOper().equals(serviceGiven.getFacilityHoursOfOper())) return false;
        return getSpecialDetails().equals(serviceGiven.getSpecialDetails());
    }

    @Override
    public int hashCode() {
        int result = getTypeOfService().hashCode();
        result = 31 * result + getServiceProvider().hashCode();
        result = 31 * result + getTypeOfCommunity().hashCode();
        result = 31 * result + getTypeOfFoodSvc().hashCode();
        result = 31 * result + getTypeOfHealthSvc().hashCode();
        result = 31 * result + getTypeOfClothingCloset().hashCode();
        result = 31 * result + getEligibility().hashCode();
        result = 31 * result + getReqDocuments().hashCode();
        result = 31 * result + getIntakeProcedure().hashCode();
        result = 31 * result + getTimePlaceInfo().hashCode();
        result = 31 * result + getFacilityHoursOfOper().hashCode();
        result = 31 * result + getSpecialDetails().hashCode();
        result = 31 * result + (isPossibleFees() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ServiceGiven{" +
                "serviceID=" + serviceID +
                ", TypeOfService=" + TypeOfService +
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
