package org.helpinghands.serviceinfo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.helpinghands.serviceinfo.domain.ServiceProvider;
//import org.helpinghands.serviceinfo.service.ServiceProviderService;
import org.helpinghands.serviceinfo.service.ServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class ServiceProviderController {

//    @Autowired
//    private ServiceProviderService serviceProviderSvc;

    @Autowired
    ServiceProviderService svcProviderService;

    //Java to Json
    private ObjectMapper objectMapper = new ObjectMapper();
    
    @GetMapping("/")
    public String homePage(){
        return "Welcome To My Home Page";
    }

    /**
     * *
     * @return
     * Returns a list of all ServiceGiven Providers
     */
    @GetMapping("/api/org/svcProviderList")
     public List<ServiceProvider> getAllServiceProviders() {
        return svcProviderService.getAllServiceProviders();
     }
    
    /**
     * Add a service provider
     */
    @PostMapping("/api/admin/org/createprofile")
    public ServiceProvider addServiceProvider(@RequestBody String json) throws IOException {
        ServiceProvider newServiceProvider = objectMapper.readValue(json, ServiceProvider.class);
        return svcProviderService.add(newServiceProvider);
    }

    /**
     * Update ServiceGiven Provider
     */
    @PutMapping("/api/admin/{providerid}/updateinfo")
    public ServiceProvider updateServiceProvider(@PathVariable("ID") Integer ID, @RequestBody String json) throws IOException {
        ServiceProvider updatedServiceProvider = objectMapper.readValue(json, ServiceProvider.class);
        updatedServiceProvider.setID(ID);
        svcProviderService.update(updatedServiceProvider);
        return updatedServiceProvider;
    }

    /**
     * Gets a list of all ServiceGiven Providers, without the services they provide
     * @return A list of all ServiceGiven Providers
     */
    @GetMapping("/api/org/serviceproviders")
    public List<ServiceProvider> getServiceProviders() {
       return svcProviderService.getAllServiceProviders();
    }

    /**
     *
     * @return A list of Service Providers along with the services they provide
     */

    @DeleteMapping("/api/org/{ID}/delete")
    public String deleteProvider(@PathVariable int ID) {
//        serviceProviderSvc.delete(ID);
        svcProviderService.delete(ID);
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
