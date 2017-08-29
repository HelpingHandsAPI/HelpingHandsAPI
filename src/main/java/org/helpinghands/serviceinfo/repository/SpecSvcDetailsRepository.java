package org.helpinghands.serviceinfo.repository;

import org.helpinghands.serviceinfo.domain.SpecificServiceDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecSvcDetailsRepository extends JpaRepository<SpecificServiceDetails, Integer> {
}
