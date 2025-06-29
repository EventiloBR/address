package com.eventilobr.address.infrastructure.controller.impl;

import com.eventilobr.address.infrastructure.controller.AddressController;
import com.eventilobr.address.infrastructure.controller.request.AddressRequest;
import com.eventilobr.address.infrastructure.controller.response.AddressResponse;
import com.eventilobr.address.infrastructure.service.AddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@Log4j2
@RestController
@RequiredArgsConstructor
public class AddressControllerImpl implements AddressController {

    private final AddressService service;

    @Override
    public ResponseEntity<AddressResponse> saveAddress(AddressRequest request) {
        log.info("Received request to save address: {}", request);
        URI location = URI.create("/address");
        return ResponseEntity.created(location).body(this.service.createAddress(request));
    }

}
