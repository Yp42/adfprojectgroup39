package com.appdev.project.dtos;

public record PlanetDTO(
        int ID,
        String Name,
        String Type,
        int Radius,
        double Mass,
        int Orbital_Period
) {
}
