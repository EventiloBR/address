package com.eventilobr.address.infrastructure.service;

import com.eventilobr.address.infrastructure.controller.request.AddressRequest;
import com.eventilobr.address.infrastructure.controller.response.AddressResponse;

public interface AddressService {
    AddressResponse createAddress(AddressRequest request);
}
