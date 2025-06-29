package com.eventilobr.address.application.address;

import com.eventilobr.address.domain.entity.Address;
import com.eventilobr.address.domain.entity.Neighborhood;
import com.eventilobr.address.infrastructure.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class SaveAddressUseCase {

    private final AddressRepository repository;

    public Address execute(Address address, Neighborhood neighborhood) {
        log.info("Saving new address: {}", address);
        address.setNeighborhood(neighborhood);
        return this.repository.save(address);
    }

}
