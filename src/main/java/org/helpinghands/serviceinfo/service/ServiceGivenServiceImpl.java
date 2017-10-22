package org.helpinghands.serviceinfo.service;

import org.helpinghands.serviceinfo.domain.ServiceGiven;
import org.helpinghands.serviceinfo.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceGivenServiceImpl implements ServiceGivenService {

    @Autowired
    private ServiceRepository serviceRepository;

    public List<ServiceGiven> getProviderServicesOffered(int providerID) {
        List<ServiceGiven> providerServicesOffered = new ArrayList<>();
        serviceRepository.findByServiceProviderId(providerID).forEach(providerServicesOffered::add);
        return providerServicesOffered;
    }

    @Override
    public ServiceGiven add(ServiceGiven serviceGiven) {
        return serviceRepository.save(serviceGiven);
    }

    @Override
    public void add(List<ServiceGiven> serviceGivens){
        for (ServiceGiven serviceGiven : serviceGivens){
            serviceRepository.save(serviceGiven);
        }
    }
    
    @Override
    public void update(ServiceGiven serviceGiven){
        serviceRepository.save(serviceGiven);
    }

    @Override
    public void delete(int ID){
        ServiceGiven serviceGiven = this.getService(ID);
        serviceRepository.delete(ID);
    }

    @Override
    public ServiceGiven findByServiceID(int serviceID){
        return serviceRepository.findOne(serviceID);
    }

    @Override
    public List<ServiceGiven> getAllServices(){
        return serviceRepository.findAll();
    }

    private ServiceGiven getService(int serviceID){
        ServiceGiven serviceGiven = serviceRepository.findOne(serviceID);
        return serviceGiven;
    }
    
}
