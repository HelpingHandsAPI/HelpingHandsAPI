package org.helpinghands.serviceinfo.repository;

import org.helpinghands.serviceinfo.domain.ServiceProvider;
import org.helpinghands.serviceinfo.domain.TypeOfCommunity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, Integer>{

    List<ServiceProvider> findByTypeOfCommunity(TypeOfCommunity groups);
    
}
