package com.appdev.project.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record PlanetNameMassDTO(

        @NotBlank(message = "A Name must be provided")
        String Name,

        @Positive(message = "A Mass must be provided and be positive")
        double Mass
) {
}
