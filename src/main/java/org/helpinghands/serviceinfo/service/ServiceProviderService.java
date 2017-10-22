package org.helpinghands.serviceinfo.service;

import org.helpinghands.serviceinfo.domain.ServiceProvider;
import org.helpinghands.serviceinfo.domain.TypeOfCommunity;

//import java.util.Comparator;
import java.util.List;

public interface ServiceProviderService {
    //Add, Update and delete ServiceGiven Provider
    ServiceProvider add(ServiceProvider serviceProvider);
    void add(List<ServiceProvider> serviceProviders);
    void update(ServiceProvider serviceProvider);
    void delete(int id);

    //Get ServiceGiven Provider by ID
    ServiceProvider getServiceProviderById(int id);
    
    //Get a list of all ServiceGiven Providers
    List<ServiceProvider> getAllServiceProviders();

    //Get a list of all ServiceGiven Providers sorted by city, state, zip or name
    List<ServiceProvider> sortAllByCity();
    List<ServiceProvider> sortAllByState();
    List<ServiceProvider> sortAllByZipCode();
    List<ServiceProvider> sortAllByName();

    //Get a list of ServiceGiven Providers for a particular city, state, zip or name
    List<ServiceProvider> getListForCity(String city);
    List<ServiceProvider> getListForState(String state);
    List<ServiceProvider> getListForZipCode(int zip);
    List<ServiceProvider> getListForName(String name);

//    //Get a list of ServiceGiven Providers who provide specific services
//    ServiceProvider getSvcProvidersByType(ServiceGiven TypeOfService);

    //Get a list of ServiceGiven Providers who provide services to
    //a specific group men, women etc.
    List<ServiceProvider> getSvcByGroupServed(TypeOfCommunity groupServed);

}
