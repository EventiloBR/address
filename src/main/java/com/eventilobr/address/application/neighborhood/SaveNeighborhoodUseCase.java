package com.eventilobr.address.application.neighborhood;

import com.eventilobr.address.domain.entity.City;
import com.eventilobr.address.domain.entity.Neighborhood;
import com.eventilobr.address.infrastructure.repository.NeighborhoodRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class SaveNeighborhoodUseCase {

    private final NeighborhoodRepository repository;

    public Neighborhood execute(Neighborhood neighborhood, City city) {
        Neighborhood existingNeighborhood = this.repository.findByName(neighborhood.getName())
                .orElse(null);

        if (existingNeighborhood != null) {
            log.info("Neighborhood with name {} already exists, skipping save.", neighborhood.getName());
            existingNeighborhood.setCity(city);
            return existingNeighborhood;
        }

        log.info("Saving new neighborhood: {}", neighborhood);
        neighborhood.setCity(city);
        return this.repository.save(neighborhood);
    }

}
