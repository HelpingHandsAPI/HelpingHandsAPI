package org.helpinghands.serviceinfo.domain;

import java.util.ArrayList;;
import java.util.List;
import java.util.Set;

public abstract class Service {
    private int serviceID;
    private Enum SpecificServiceType;
    private ServiceProvider svcProviderId;
    private ServiceProvider svcProviderName;

    static final int COMMUNITY_SERVED_MEN = 1;
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
                ", SpecificServiceType=" + SpecificServiceType +
                ", svcProviderID=" + svcProviderId +
                ", svcProviderName=" + svcProviderName +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Service)) return false;

        Service service = (Service) o;

        if (serviceID != service.serviceID) return false;
        return SpecificServiceType.equals(service.SpecificServiceType);
    }

    @Override
    public int hashCode() {
        int result = serviceID;
        result = 31 * result + SpecificServiceType.hashCode();
        return result;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public Enum getSpecificServiceType() {
        return SpecificServiceType;
    }

    public void setSpecificServiceType(Enum specificServiceType) {
        SpecificServiceType = specificServiceType;
    }

    public ServiceProvider getSvcProviderId() {
        return svcProviderId;
    }

    public void setSvcProviderId(ServiceProvider svcProviderId) {
        this.svcProviderId = svcProviderId;
    }

    public ServiceProvider getSvcProviderName() {
        return svcProviderName;
    }

    public void setSvcProviderName(ServiceProvider svcProviderName) {
        this.svcProviderName = svcProviderName;
    }

    public static int getCommunityServedMen() {
        return COMMUNITY_SERVED_MEN;
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
