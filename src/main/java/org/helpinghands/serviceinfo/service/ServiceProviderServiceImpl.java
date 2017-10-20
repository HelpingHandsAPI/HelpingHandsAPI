package org.helpinghands.serviceinfo.service;

import org.helpinghands.serviceinfo.domain.ServiceProvider;
import org.helpinghands.serviceinfo.repository.ServiceProviderRepository;
import org.helpinghands.serviceinfo.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.persistence.OrderBy;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceProviderServiceImpl implements ServiceProviderService {

    @Autowired
    ServiceProviderRepository svcProviderRepository;

    @Autowired
    ServiceRepository serviceRepository;

    @Transactional
    @Override
    public ServiceProvider add(ServiceProvider serviceProvider){ return svcProviderRepository.save(serviceProvider);}


    @Transactional
    @Override
    public void add(List<ServiceProvider> serviceProviders){
       for (ServiceProvider serviceProvider : serviceProviders) {
           svcProviderRepository.save(serviceProvider);
       }
    }

    @Transactional
    @Override
    public void update(ServiceProvider serviceProvider){
        svcProviderRepository.save(serviceProvider);
    }

    @Transactional
    @Override
    public void delete(int id){
        svcProviderRepository.delete(id);
    }

    @Transactional
    @Override
    public ServiceProvider getServiceProviderById(int id){
        return getServiceProvider(id);
    }

//    @Transactional
//    @Override
//    public List<Service> getServicesOffered(int id){
//    List<Service> servicesOffered = new ArrayList<>();
//    svcProviderRepository.findOne(id).getServicesProvided();
    
//
//    return servicesOffered;
//    }


    
    @Override
    public List<Service> addService(Service service) {

    }

    @Override
    public List<Service> deleteService(Service service) {

    }

    @Transactional
    @Override
    public List<ServiceProvider> getAllServiceProviders() {
        List<ServiceProvider> allServiceProviders = new ArrayList<>();
        svcProviderRepository.findAll().forEach(allServiceProviders::add);
        return allServiceProviders;
    }

    @Override
    @OrderBy
    public List<ServiceProvider> sortAllByCity() {
        return null;
    }

    @Override
    public List<ServiceProvider> sortAllByState() {
      return null;
    }

    @Override
    public List<ServiceProvider> sortAllByZipCode() {
        return null;
    }

    @Override
    public List<ServiceProvider> sortAllByName() {
        return null;
    }

    @Override
    public List<ServiceProvider> getListForCity(String city){return null;}

    @Override
    public List<ServiceProvider> getListForState(String state){return null;}

    @Override
    public List<ServiceProvider> getListForZipCode(int zip){return null;}

    @Override
    public List<ServiceProvider> getListForName(String name){return null;}

    @Override
    public ServiceProvider getSvcProvidersByType(org.helpinghands.serviceinfo.domain.Service TypeOfService) {
        return null;
    }

    @Override
    public List<org.helpinghands.serviceinfo.domain.Service> getSvcByGroupServed() {
        return null;
    }


    private ServiceProvider getServiceProvider(int id) {
        ServiceProvider serviceProvider = svcProviderRepository.findOne(id);
        serviceProvider.getServicesProvided();
        return serviceProvider;
    }

}
