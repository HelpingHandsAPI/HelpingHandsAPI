package org.helpinghands.serviceinfo.service;

import org.helpinghands.serviceinfo.domain.Service;
import org.helpinghands.serviceinfo.domain.ServiceProvider;
import org.helpinghands.serviceinfo.domain.SpecificServiceDetails;

import java.util.ArrayList;
import java.util.List;

public interface HHService {

    //Add service along with all details needed
    SpecificServiceDetails add(SpecificServiceDetails service);

    //Update and delete Service Provider
    void update(SpecificServiceDetails service);
    void delete(int id);

    //Get a particular service along with all details
    SpecificServiceDetails getServiceById(int id);

    //Get list of services along with specific service details
    void add(List<SpecificServiceDetails> SpecificServiceDetails);
    List<SpecificServiceDetails> getServicesList();

    //Get Service Provider info who provides service
    ServiceProvider getSvcProviderInfo(ServiceProvider serviceProvider);
}

;