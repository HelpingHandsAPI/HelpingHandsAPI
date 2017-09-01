package org.helpinghands.serviceinfo.service;

import org.helpinghands.serviceinfo.domain.ServiceProvider;
import org.helpinghands.serviceinfo.repository.ServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HHServiceProviderImpl {

    @Autowired
    private ServiceProviderRepository svcProviderRepository;

    public List<ServiceProvider> getServiceProviders() {
        List<ServiceProvider> serviceProviders = new ArrayList<>();
        svcProviderRepository.findAll()
        .forEach(serviceProviders::add);
        return serviceProviders;
    }

    public void add(ServiceProvider serviceProvider){
        svcProviderRepository.save(serviceProvider);
    }

    void update(ServiceProvider serviceProvider){

    }

    void delete(ServiceProvider serviceProvider){

    }

}
