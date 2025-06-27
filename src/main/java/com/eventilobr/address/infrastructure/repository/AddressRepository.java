package com.eventilobr.address.infrastructure.repository;

import com.eventilobr.address.domain.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {}
