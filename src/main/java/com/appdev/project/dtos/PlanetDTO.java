package com.appdev.project.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record PlanetDTO(
        int id,

        @NotBlank(message = "A Name must be provided")
        String Name,

        @NotBlank(message = "A Type must be provided")
        String Type,

        @Positive(message = "A Radius must be provided and be positive")
        int Radius,

        @Positive(message = "A Mass must be provided and be positive")
        double Mass,

        @Positive(message = "An Orbital_Period must be provided and be positive")
        int Orbital_Period
) {
}
