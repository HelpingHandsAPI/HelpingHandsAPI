package org.helpinghands.serviceinfo.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "ServiceProvider")
public class ServiceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int providerID;

    @Column(name = "ProviderName")
    private String name;

    @Column(name = "Website")
    private String website;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Address")
    private String address;

    @Column(name = "City")
    private String city;

    @Column(name = "State")
    private State state;

    @Column(name = "Zip")
    private int zip;

//    @Column
//    @ElementCollection
//    @CollectionTable(
//            name="Service",
//            joinColumns=@JoinColumn(name="serviceID"))
    @OneToMany
    private List<Service> servicesProvided;

    public ServiceProvider() {
    }

    public List<Service> getServicesProvided() {
        return servicesProvided;
    }

    public void setServicesProvided(List<Service> servicesProvided) {
        this.servicesProvided = servicesProvided;
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

//@OneToMany(targetEntity = Service.class, mappedBy = "serviceProvider",
//    cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    public List<String> getServicesProvided() {
//        return servicesProvided;
//    }
//
//    public void setServicesProvided(List<String> servicesProvided) {
//        this.servicesProvided = servicesProvided;
//    }

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
}
