package org.helpinghands.serviceinfo.domain;

import java.util.List;

public class SpecificServiceDetails extends Service{
    private List<String> miniServices;
    private List<String> eligibility;
    private List<String> reqDocuments;
    private List<String> intakeProcedure;
    private List<String> timePlaceInfo;
    private List<String> facilityHoursOfOper;
    private List<String> specialDetails;
    private boolean possibleFees;

    public SpecificServiceDetails() {
    }

    @Override
    public Enum getSpecificServiceType() {
        return super.getSpecificServiceType();
    }

    @Override
    public int getServiceID() {
        return super.getServiceID();
    }

    @Override
    public void setServiceID(int serviceID) {
        super.setServiceID(serviceID);
    }

    @Override
    public void setSpecificServiceType(Enum specificServiceType) {
        super.setSpecificServiceType(specificServiceType);
    }

    @Override
    public String toString() {
        return "SpecificServiceDetails{" +
                "miniServices=" + miniServices +
                ", eligibility=" + eligibility +
                ", reqDocuments=" + reqDocuments +
                ", intakeProcedure=" + intakeProcedure +
                ", timePlaceInfo=" + timePlaceInfo +
                ", facilityHoursOfOper=" + facilityHoursOfOper +
                ", specialDetails=" + specialDetails +
                ", possibleFees=" + possibleFees +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SpecificServiceDetails)) return false;
        if (!super.equals(o)) return false;

        SpecificServiceDetails that = (SpecificServiceDetails) o;

        if (possibleFees != that.possibleFees) return false;
        if (!miniServices.equals(that.miniServices)) return false;
        if (!eligibility.equals(that.eligibility)) return false;
        if (!reqDocuments.equals(that.reqDocuments)) return false;
        if (!intakeProcedure.equals(that.intakeProcedure)) return false;
        if (!timePlaceInfo.equals(that.timePlaceInfo)) return false;
        if (!facilityHoursOfOper.equals(that.facilityHoursOfOper)) return false;
        return specialDetails != null ? specialDetails.equals(that.specialDetails) : that.specialDetails == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + miniServices.hashCode();
        result = 31 * result + eligibility.hashCode();
        result = 31 * result + reqDocuments.hashCode();
        result = 31 * result + intakeProcedure.hashCode();
        result = 31 * result + timePlaceInfo.hashCode();
        result = 31 * result + facilityHoursOfOper.hashCode();
        result = 31 * result + (specialDetails != null ? specialDetails.hashCode() : 0);
        result = 31 * result + (possibleFees ? 1 : 0);
        return result;
    }

    public List<String> getMiniServices() {
        return miniServices;
    }

    public void setMiniServices(List<String> miniServices) {
        this.miniServices = miniServices;
    }

    public List<String> getEligibility() {
        return eligibility;
    }

    public void setEligibility(List<String> eligibility) {
        this.eligibility = eligibility;
    }

    public List<String> getReqDocuments() {
        return reqDocuments;
    }

    public void setReqDocuments(List<String> reqDocuments) {
        this.reqDocuments = reqDocuments;
    }

    public List<String> getIntakeProcedure() {
        return intakeProcedure;
    }

    public void setIntakeProcedure(List<String> intakeProcedure) {
        this.intakeProcedure = intakeProcedure;
    }

    public List<String> getTimePlaceInfo() {
        return timePlaceInfo;
    }

    public void setTimePlaceInfo(List<String> timePlaceInfo) {
        this.timePlaceInfo = timePlaceInfo;
    }

    public List<String> getFacilityHoursOfOper() {
        return facilityHoursOfOper;
    }

    public void setFacilityHoursOfOper(List<String> facilityHoursOfOper) {
        this.facilityHoursOfOper = facilityHoursOfOper;
    }

    public List<String> getSpecialDetails() {
        return specialDetails;
    }

    public void setSpecialDetails(List<String> specialDetails) {
        this.specialDetails = specialDetails;
    }

    public boolean isPossibleFees() {
        return possibleFees;
    }

    public void setPossibleFees(boolean possibleFees) {
        this.possibleFees = possibleFees;
    }
}
