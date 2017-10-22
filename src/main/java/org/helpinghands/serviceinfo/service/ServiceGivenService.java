package org.helpinghands.serviceinfo.service;

import org.helpinghands.serviceinfo.domain.ServiceGiven;

import java.util.List;

public interface ServiceGivenService {
    //Add, Update and delete ServiceGiven Provider
    ServiceGiven add(ServiceGiven serviceGiven);
    void add(List<ServiceGiven> serviceGiven);
    void update(ServiceGiven serviceGiven);
    void delete(int id);

    //Get ServiceGiven Provider by ID
    ServiceGiven findByServiceID(int serviceID);

    //Get a list of all Services
    List<ServiceGiven> getAllServices();

//    //Get a list of ServiceGiven Providers who provide services to
//    //a specific group men, women etc.
//    List<ServiceGiven> getSvcByGroupServed();

    List<ServiceGiven> getProviderServicesOffered(int ID);

}
