package org.helpinghands.serviceinfo.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table( name = "ServiceProvider")
public class ServiceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ProviderID", updatable=false, nullable=false)
    private int ID;

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

    @Column(name="DateModified")
    private Date dateModified = new Date();

    @Column(name = "Verified")
    private boolean infoVerified;

    @OneToMany(mappedBy = "serviceProvider", fetch = FetchType.LAZY)
    @JoinColumn(name="ProviderID")
    private List<ServiceGiven> servicesProvided = new ArrayList<>();


    public ServiceProvider() {
    }

    public ServiceProvider(int ID) {
        this.ID = ID;
    }

    public void addService(ServiceGiven providerServiceGiven) {
        this.servicesProvided.add(providerServiceGiven);
        providerServiceGiven.setServiceProvider(this);
    }

    public List<ServiceGiven> getServicesProvided() {
        return servicesProvided;
    }

    public void setServicesProvided(List<ServiceGiven> servicesProvided) {
        this.servicesProvided = servicesProvided;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public boolean isInfoVerified() {
        return infoVerified;
    }

    public void setInfoVerified(boolean infoVerified) {
        this.infoVerified = infoVerified;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

//@OneToMany(targetEntity = ServiceGiven.class, mappedBy = "serviceProvider",
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

        if (getZip() != that.getZip()) return false;
        if (isInfoVerified() != that.isInfoVerified()) return false;
        if (!getName().equals(that.getName())) return false;
        if (getWebsite() != null ? !getWebsite().equals(that.getWebsite()) : that.getWebsite() != null) return false;
        if (!getPhone().equals(that.getPhone())) return false;
        if (!getAddress().equals(that.getAddress())) return false;
        if (!getCity().equals(that.getCity())) return false;
        if (getState() != that.getState()) return false;
        if (!getDateModified().equals(that.getDateModified())) return false;
        return getServicesProvided() != null ? getServicesProvided().equals(that.getServicesProvided()) : that.getServicesProvided() == null;
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + (getWebsite() != null ? getWebsite().hashCode() : 0);
        result = 31 * result + getPhone().hashCode();
        result = 31 * result + getAddress().hashCode();
        result = 31 * result + getCity().hashCode();
        result = 31 * result + getState().hashCode();
        result = 31 * result + getZip();
        result = 31 * result + getDateModified().hashCode();
        result = 31 * result + (isInfoVerified() ? 1 : 0);
        result = 31 * result + (getServicesProvided() != null ? getServicesProvided().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ServiceProvider{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state=" + state +
                ", zip=" + zip +
                ", dateModified=" + dateModified +
                ", infoVerified=" + infoVerified +
                ", servicesProvided=" + servicesProvided +
                '}';
    }
}
