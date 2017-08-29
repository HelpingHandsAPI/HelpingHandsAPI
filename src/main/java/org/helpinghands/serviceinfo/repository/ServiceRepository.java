package org.helpinghands.serviceinfo.repository;

import org.helpinghands.serviceinfo.domain.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service, Integer>{

}
