package com.appdev.project.dtos;

import com.appdev.project.entities.Planet;

public class Mappers {
    public static PlanetDTO mapPlanetToPlanetDTO(Planet p) {
        return new PlanetDTO(
                p.getPlanetId(),
                p.getName(),
                p.getType(),
                p.getRadiusKm(),
                p.getMassKg(),
                p.getOrbitalPeriodDays()
        );
    }

    public static Planet mapPlanetDTOtoPlanet(PlanetDTO dto) {
        return new Planet(
                0,
                dto.Name(),
                dto.Type(),
                dto.Radius(),
                dto.Mass(),
                dto.Orbital_Period()
        );
    }
}
