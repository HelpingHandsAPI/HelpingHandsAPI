package org.helpinghands.serviceinfo.service;

import org.helpinghands.serviceinfo.domain.Service;
import org.helpinghands.serviceinfo.domain.ServiceProvider;

import java.util.List;

public interface HHService {

    //Add service along with all details needed
    Service add(Service service);

    //Update and delete Service Provider
    void update(Service service);
    void delete(int id);

    //Get a particular service along with all details
    Service getServiceById(int id);

    //Get list of services along with specific service details
    void add(List<Service> Services);
    List<Service> getServicesList();

    //Get Service Provider info who provides service
    ServiceProvider getSvcProviderInfo(ServiceProvider serviceProvider);
}
