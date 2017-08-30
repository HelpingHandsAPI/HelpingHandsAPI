package org.helpinghands.serviceinfo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "Service")
public class Service {
    private ServiceProvider svcProviderId;
    private ServiceProvider svcProviderName;
    private int serviceID;
    private Enum TypeOfService;
    private Enum TypeOfCommunity;
    private Enum TypeOfFoodSvc;
    private Enum TypeOfHealthSvc;
    private Enum TypeOfClothingCloset;
    private List<String> specificSvcCombo;
    private String eligibility;
    private String reqDocuments;
    private String intakeProcedure;
    private String timePlaceInfo;
    private String facilityHoursOfOper;
    private String specialDetails;
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

    @JsonIgnore
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="providerID")
    public ServiceProvider getSvcProviderId() {
        return svcProviderId;
    }

    //@JsonIgnore
    public void setSvcProviderId(ServiceProvider svcProviderId) {
        this.svcProviderId = svcProviderId;
    }

    @Column(name = "ProviderName")
    public ServiceProvider getSvcProviderName() {
        return svcProviderName;
    }

    //@JsonIgnore
    public void setSvcProviderName(ServiceProvider svcProviderName) {
        this.svcProviderName = svcProviderName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    @Column(name = "ServiceName")
    public Enum getTypeOfService() {
        return TypeOfService;
    }

    public void setTypeOfService(Enum typeOfService) {
        TypeOfService = typeOfService;
    }

    @Column(name = "CommunityServed")
    public Enum getTypeOfCommunity() {
        return TypeOfCommunity;
    }

    public void setTypeOfCommunity(Enum typeOfCommunity) {
        TypeOfCommunity = typeOfCommunity;
    }

    @Column(name = "FoodService")
    public Enum getTypeOfFoodSvc() {
        return TypeOfFoodSvc;
    }

    public void setTypeOfFoodSvc(Enum typeOfFoodSvc) {
        TypeOfFoodSvc = typeOfFoodSvc;
    }

    @Column(name = "HealthService")
    public Enum getTypeOfHealthSvc() {
        return TypeOfHealthSvc;
    }

    public void setTypeOfHealthSvc(Enum typeOfHealthSvc) {
        TypeOfHealthSvc = typeOfHealthSvc;
    }

    @Column(name = "TypeOfClothing")
    public Enum getTypeOfClothingCloset() {
        return TypeOfClothingCloset;
    }

    public void setTypeOfClothingCloset(Enum typeOfClothingCloset) {
        TypeOfClothingCloset = typeOfClothingCloset;
    }

//    @JsonIgnore
//    @ManyToOne(fetch=FetchType.LAZY)
//    @JoinColumn(name="providerID")
//    public List<String> getSpecificSvcCombo() {
//        return specificSvcCombo;
//    }
//
//    public void setSpecificSvcCombo(List<String> specificSvcCombo) {
//        this.specificSvcCombo = specificSvcCombo;
//    }

    @Column(name = "Eligibility")
    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    @Column(name = "RequiredDocuments")
    public String getReqDocuments() {
        return reqDocuments;
    }

    public void setReqDocuments(String reqDocuments) {
        this.reqDocuments = reqDocuments;
    }

    @Column(name = "IntakeProcedure")
    public String getIntakeProcedure() {
        return intakeProcedure;
    }

    public void setIntakeProcedure(String intakeProcedure) {
        this.intakeProcedure = intakeProcedure;
    }

    @Column(name = "TimePlace")
    public String getTimePlaceInfo() {
        return timePlaceInfo;
    }

    public void setTimePlaceInfo(String timePlaceInfo) {
        this.timePlaceInfo = timePlaceInfo;
    }

    @Column(name = "HoursOfOperation")
    public String getFacilityHoursOfOper() {
        return facilityHoursOfOper;
    }

    public void setFacilityHoursOfOper(String facilityHoursOfOper) {
        this.facilityHoursOfOper = facilityHoursOfOper;
    }

    @Column(name = "SpecialDetails")
    public String getSpecialDetails() {
        return specialDetails;
    }

    public void setSpecialDetails(String specialDetails) {
        this.specialDetails = specialDetails;
    }

    @Column(name = "Fees")
    public boolean isPossibleFees() {
        return possibleFees;
    }

    public void setPossibleFees(boolean possibleFees) {
        this.possibleFees = possibleFees;
    }


    @Override
    public String toString() {
        return "Service{" +
                "svcProviderId=" + svcProviderId +
                "svcProviderName=" + svcProviderName +
                ", serviceID=" + serviceID +
                ", TypeOfService=" + TypeOfService +
                ", TypeOfCommunity=" + TypeOfCommunity +
                ", TypeOfFoodSvc=" + TypeOfFoodSvc +
                ", TypeOfHealthSvc=" + TypeOfHealthSvc +
                ", TypeOfClothingCloset=" + TypeOfClothingCloset +
//                ", specificSvcCombo=" + specificSvcCombo +
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
        if (!getSvcProviderId().equals(service.getSvcProviderId())) return false;
        if (!getTypeOfService().equals(service.getTypeOfService())) return false;
        if (!getTypeOfCommunity().equals(service.getTypeOfCommunity())) return false;
        if (!getTypeOfFoodSvc().equals(service.getTypeOfFoodSvc())) return false;
        if (!getTypeOfHealthSvc().equals(service.getTypeOfHealthSvc())) return false;
        if (!getTypeOfClothingCloset().equals(service.getTypeOfClothingCloset())) return false;
//        if (getSpecificSvcCombo() != null ? !getSpecificSvcCombo().equals(service.getSpecificSvcCombo()) : service.getSpecificSvcCombo() != null)
//            return false;
        if (!getEligibility().equals(service.getEligibility())) return false;
        if (!getReqDocuments().equals(service.getReqDocuments())) return false;
        if (!getIntakeProcedure().equals(service.getIntakeProcedure())) return false;
        if (!getTimePlaceInfo().equals(service.getTimePlaceInfo())) return false;
        if (!getFacilityHoursOfOper().equals(service.getFacilityHoursOfOper())) return false;
        return getSpecialDetails() != null ? getSpecialDetails().equals(service.getSpecialDetails()) : service.getSpecialDetails() == null;
    }

    @Override
    public int hashCode() {
        int result = getSvcProviderId().hashCode();
//        result = 31 * result + getServiceID();
//        result = 31 * result + getTypeOfService().hashCode();
//        result = 31 * result + getTypeOfCommunity().hashCode();
//        result = 31 * result + getTypeOfFoodSvc().hashCode();
//        result = 31 * result + getTypeOfHealthSvc().hashCode();
//        result = 31 * result + getTypeOfClothingCloset().hashCode();
//        result = 31 * result + (getSpecificSvcCombo() != null ? getSpecificSvcCombo().hashCode() : 0);
//        result = 31 * result + getEligibility().hashCode();
//        result = 31 * result + getReqDocuments().hashCode();
//        result = 31 * result + getIntakeProcedure().hashCode();
//        result = 31 * result + getTimePlaceInfo().hashCode();
//        result = 31 * result + getFacilityHoursOfOper().hashCode();
//        result = 31 * result + (getSpecialDetails() != null ? getSpecialDetails().hashCode() : 0);
//        result = 31 * result + (isPossibleFees() ? 1 : 0);
        return result;
    }
}
