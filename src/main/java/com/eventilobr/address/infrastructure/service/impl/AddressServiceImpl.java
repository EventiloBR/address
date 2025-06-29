package com.eventilobr.address.infrastructure.service.impl;

import com.eventilobr.address.application.address.SaveAddressUseCase;
import com.eventilobr.address.application.city.SaveCityUseCase;
import com.eventilobr.address.application.neighborhood.SaveNeighborhoodUseCase;
import com.eventilobr.address.application.state.SaveStateUseCase;
import com.eventilobr.address.domain.entity.Address;
import com.eventilobr.address.domain.entity.City;
import com.eventilobr.address.domain.entity.Neighborhood;
import com.eventilobr.address.domain.entity.State;
import com.eventilobr.address.infrastructure.controller.request.AddressRequest;
import com.eventilobr.address.infrastructure.controller.response.AddressResponse;
import com.eventilobr.address.infrastructure.service.AddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final SaveStateUseCase saveStateUseCase;
    private final SaveCityUseCase saveCityUseCase;
    private final SaveNeighborhoodUseCase saveNeighborhoodUseCase;
    private final SaveAddressUseCase saveAddressUseCase;

    @Override
    public AddressResponse createAddress(AddressRequest request) {
        log.info("Creating address with request: {}", request);

        State state = this.saveStateUseCase.execute(new State(request));
        log.info("State created successfully with ID: {}", state.getId());
        City city = this.saveCityUseCase.execute(new City(request), state);
        log.info("City created successfully with ID: {}", city.getId());
        Neighborhood neighborhood = this.saveNeighborhoodUseCase.execute(new Neighborhood(request), city);
        log.info("Neighborhood created successfully with ID: {}", neighborhood.getId());
        Address address = this.saveAddressUseCase.execute(new Address(request), neighborhood);
        log.info("Address created successfully with ID: {}", address.getId());

        return new AddressResponse(address);
    }

}
