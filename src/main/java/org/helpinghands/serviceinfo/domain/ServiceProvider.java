package org.helpinghands.serviceinfo.domain;

public class ServiceProvider {
    private int providerID;
    private String name;
    private String website;
    private String phone;
    private String address;
    private String city;
    private State state;
    private int zip;

    public ServiceProvider() {
    }

    @Override
    public String toString() {
        return "Service{" +
                "providerID=" + providerID +
                ", name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServiceProvider)) return false;

        ServiceProvider that = (ServiceProvider) o;

        if (getProviderID() != that.getProviderID()) return false;
        if (getZip() != that.getZip()) return false;
        if (!getName().equals(that.getName())) return false;
        if (getWebsite() != null ? !getWebsite().equals(that.getWebsite()) : that.getWebsite() != null) return false;
        if (getPhone() != null ? !getPhone().equals(that.getPhone()) : that.getPhone() != null) return false;
        if (!getAddress().equals(that.getAddress())) return false;
        if (!getCity().equals(that.getCity())) return false;
        return getState().equals(that.getState());
    }

    @Override
    public int hashCode() {
        int result = getProviderID();
        result = 31 * result + getName().hashCode();
        result = 31 * result + (getWebsite() != null ? getWebsite().hashCode() : 0);
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        result = 31 * result + getAddress().hashCode();
        result = 31 * result + getCity().hashCode();
        result = 31 * result + getState().hashCode();
        result = 31 * result + getZip();
        return result;
    }

    public int getProviderID() {
        return providerID;
    }

    public void setProviderID(int providerID) {
        this.providerID = providerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

}
