package org.helpinghands.serviceinfo.repository;

import org.helpinghands.serviceinfo.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Integer> {
}
