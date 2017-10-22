package org.helpinghands.serviceinfo.repository;

import org.helpinghands.serviceinfo.domain.ServiceGiven;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<ServiceGiven, Integer>{
    
    List<ServiceGiven> findByServiceProviderId(int ID);
    
}
