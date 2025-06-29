package com.eventilobr.address.application.state;

import com.eventilobr.address.domain.entity.State;
import com.eventilobr.address.infrastructure.repository.StateRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class SaveStateUseCase {

    private final StateRepository repository;

    public State execute(State state) {
        State existingState = this.repository.findByName(state.getName())
                .orElse(null);

        if (existingState != null) {
            log.info("State with name {} already exists, skipping save.", state.getName());
            return existingState;
        }

        log.info("Saving new state: {}", state);
        return this.repository.save(state);
    }

}
