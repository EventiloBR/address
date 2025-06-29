package com.eventilobr.address.infrastructure.controller.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AddressRequest(
        @NotBlank(message = "Zip code is required")
        @Size(min = 8, max = 8, message = "Zip code must be exactly 8 characters")
        String zipCode,
        @NotBlank(message = "Address is required")
        @Size(min = 1, max = 255, message = "Address must be between 1 and 255 characters")
        String address,
        String number,
        String complement,
        @NotBlank(message = "Neighborhood is required")
        @Size(min = 1, max = 255, message = "Neighborhood must be between 1 and 255 characters")
        String neighborhood,
        @NotBlank(message = "City is required")
        @Size(min = 2, max = 255, message = "City must be between 2 and 255 characters")
        String city,
        @NotBlank(message = "State is required")
        @Size(min = 2, max = 2, message = "State must be exactly 2 characters")
        String state
) {}
