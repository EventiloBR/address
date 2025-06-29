package com.eventilobr.address.application.city;

import com.eventilobr.address.domain.entity.City;
import com.eventilobr.address.domain.entity.State;
import com.eventilobr.address.infrastructure.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class SaveCityUseCase {

    private final CityRepository repository;

    public City execute(City city, State state) {
        City existingCity = this.repository.findByName(city.getName())
                .orElse(null);

        if (existingCity != null) {
            log.info("City with name {} already exists, skipping save.", city.getName());
            existingCity.setState(state);
            return existingCity;
        }

        log.info("Saving new city: {}", city);
        city.setState(state);
        return this.repository.save(city);
    }



}
