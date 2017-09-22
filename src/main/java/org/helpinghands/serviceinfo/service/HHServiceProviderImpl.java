package org.helpinghands.serviceinfo.service;

import org.helpinghands.serviceinfo.domain.ServiceProvider;
import org.helpinghands.serviceinfo.repository.ServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class HHServiceProviderImpl implements HHServiceProvider {

    @Autowired
    private ServiceProviderRepository svcProviderRepository;

    @Transactional
    @Override
    public List<ServiceProvider> getServiceProviders() {
        List<ServiceProvider> serviceProviders = new ArrayList<>();
        svcProviderRepository.findAll()
        .forEach(serviceProviders::add);
        return serviceProviders;
    }

    @Transactional
    @Override
    public void add(ServiceProvider serviceProvider){
        svcProviderRepository.save(serviceProvider);
    }

    @Transactional
    @Override
    public void update(ServiceProvider serviceProvider){
        svcProviderRepository.save(serviceProvider);
    }

    @Transactional
    @Override
    public void delete(int id){
        ServiceProvider serviceProvider = this.getServiceProviderById(id);
        svcProviderRepository.delete(id);
    }

    @Override
    public List<ServiceProvider> sortByCity() {
        return null;
    }

    @Override
    public Comparator<ServiceProvider> sortByState() {
        Comparator<ServiceProvider> svcProvidersByState =
                (sp1, sp2) -> String.(sp1.getState(),sp2.getState());
        return svcProvidersByState;
    }

    @Override
    public List<ServiceProvider> sortByZipCode() {
        return null;
    }

    @Override
    public List<ServiceProvider> sortByName() {
        return null;
    }

    @Override
    public ServiceProvider getSvcProvidersByType(org.helpinghands.serviceinfo.domain.Service TypeOfService) {
        return null;
    }

    @Override
    public List<org.helpinghands.serviceinfo.domain.Service> getSvcByGroupServed() {
        return null;
    }

    @Override
    public ServiceProvider getServiceProviderById(int id) {
        return null;
    }

//    Comparator<Employee> byEmployeeNumber = (e1, e2) -> Integer.compare(
//            e1.getEmployeeNumber(), e2.getEmployeeNumber());
//
//    employees.stream().sorted(byEmployeeNumber)
//            .forEach(e -> System.out.println(e));

//    employees
//            .stream()
//            .sorted((e1, e2) -> e1.getHireDate()
//            .compareTo(e2.getHireDate()))
//            .forEach(e -> System.out.println(e));

}
