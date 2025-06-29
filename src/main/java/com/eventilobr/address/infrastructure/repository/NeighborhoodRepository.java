package com.eventilobr.address.infrastructure.repository;

import com.eventilobr.address.domain.entity.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface NeighborhoodRepository extends JpaRepository<Neighborhood, UUID> {

    Optional<Neighborhood> findByName(String name);

}
