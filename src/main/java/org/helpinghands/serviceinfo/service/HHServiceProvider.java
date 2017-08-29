package org.helpinghands.serviceinfo.service;

import org.helpinghands.serviceinfo.domain.Service;
import org.helpinghands.serviceinfo.domain.ServiceProvider;

import java.util.ArrayList;
import java.util.List;

public interface HHServiceProvider {
    //Add, Update and delete Service Provider
    void add(ServiceProvider serviceProvider);
    void update(ServiceProvider serviceProvider);
    void delete(ServiceProvider serviceProvider);

    //Get Service Provider by ID and services they provide
    ServiceProvider getServiceProviderById(int id);

    //Get a list of Service Providers along with services they provide
    List<ServiceProvider> getServiceProviders();

    //Get Service Provider list sorted by city, state, zip or name
    List<ServiceProvider> sortByCity();
    List<ServiceProvider> sortByState();
    List<ServiceProvider> sortByZipCode();
    List<ServiceProvider> sortByName();

    //Get a list of Service Providers who provide a specific
    ServiceProvider getSvcProvidersBySvcType(Service specificServiceType);

    //Get a list of Service Providers who provide services to
    //a specific group men, women etc.
    List<Service> getServicesByGroupServed();

}
