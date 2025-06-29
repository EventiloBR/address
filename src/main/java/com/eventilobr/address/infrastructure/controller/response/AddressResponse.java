package com.eventilobr.address.infrastructure.controller.response;

import com.eventilobr.address.domain.entity.Address;

public record AddressResponse(
        String addressId
) {

    public AddressResponse(Address address) {
        this(address.getId().toString());
    }

}
