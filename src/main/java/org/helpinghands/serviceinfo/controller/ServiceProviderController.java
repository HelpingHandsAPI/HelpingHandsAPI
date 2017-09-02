package org.helpinghands.serviceinfo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.helpinghands.serviceinfo.domain.Service;
import org.helpinghands.serviceinfo.domain.ServiceProvider;
//import org.helpinghands.serviceinfo.service.HHServiceProvider;
import org.helpinghands.serviceinfo.repository.ServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class ServiceProviderController {

//    @Autowired
//    private HHServiceProvider serviceProviderSvc;
    @Autowired
    ServiceProviderRepository serviceProviderRepository;

    //Java to Json
    private ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/api/org/{providerID}")
    public List<Service> getProvidersServices(@PathVariable int providerId){
        ServiceProvider serviceProvider = serviceProviderRepository.findOne(providerId);

        return serviceProvider.getServicesProvided();
    }


    /**
     * Add a service provider
     */
    @PostMapping("/api/admin/org/createprofile")
    public String addServiceProvider(@RequestBody String json) throws IOException {
        ServiceProvider newServiceProvider = objectMapper.readValue(json, ServiceProvider.class);
//        serviceProviderSvc.add(newServiceProvider);
        serviceProviderRepository.save(newServiceProvider);

        return "New Service Provider";
    }

    /**
     * Update Service Provider
     */
    @PutMapping("/api/admin/id/updateinfo")
    public String updateServiceProvider(@PathVariable("providerID") Integer providerID, @RequestBody String json) throws IOException {
        ServiceProvider updateServiceProvider = objectMapper.readValue(json, ServiceProvider.class);
        updateServiceProvider.setProviderID(providerID);
//        serviceProviderSvc.update(updateServiceProvider);
        serviceProviderRepository.save(updateServiceProvider);

        return "Updated Service Provider";
    }

    /**
     * Gets a list of all Service Providers, without the services they provide
     * @return A list of all Service Providers
     */
    @GetMapping("/api/org/serviceproviders")
    public List<ServiceProvider> getServiceProviders() {
//        return serviceProviderSvc.getServiceProviders();
       return serviceProviderRepository.findAll();
    }

    /**
     *
     * @return A list of Service providers along with the services they provide
     */

    @DeleteMapping("/api/org/{providerID}/delete")
    public String deleteProvider(@PathVariable int providerID) {
//        serviceProviderSvc.delete(providerID);

        serviceProviderRepository.findOne(providerID);
        return "Service Provider deleted";
    }

    /*
     * Exception handler for this controller. Returns a 500 error with the message of the exception
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleAppException(Exception ex) {
        System.out.println("\n\n### " + ex);
        ex.printStackTrace();
        return ex.getMessage();
    }
}
