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
}
