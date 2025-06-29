package com.eventilobr.address.infrastructure.repository;

import com.eventilobr.address.domain.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CityRepository extends JpaRepository<City, UUID> {

    Optional<City> findByName(String name);

}
