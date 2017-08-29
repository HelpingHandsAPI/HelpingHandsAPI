package org.helpinghands.serviceinfo.repository;

import org.helpinghands.serviceinfo.domain.Service;
import org.helpinghands.serviceinfo.domain.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, Integer>{
}
