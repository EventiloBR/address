package com.eventilobr.address.infrastructure.controller;

import com.eventilobr.address.infrastructure.controller.request.AddressRequest;
import com.eventilobr.address.infrastructure.controller.response.AddressResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "Address", description = "Address Management API")
@RequestMapping("/address")
public interface AddressController {

    @Operation(summary = "Save Address", description = "Create a new address")
    @PostMapping
    ResponseEntity<AddressResponse> saveAddress(@Valid @RequestBody AddressRequest request);

}
