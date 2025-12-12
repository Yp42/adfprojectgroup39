package com.appdev.project.service;

import com.appdev.project.dtos.PlanetDTO;
import com.appdev.project.dtos.PlanetNameMassDTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PlanetService {
    List<PlanetDTO> findAll();

    void createPlanet(@RequestBody PlanetDTO planetDTO);

    PlanetDTO findPlanetById(int id);

    void deletePlanetByID(int id);

    List<PlanetDTO> findByType(String type);

    PlanetNameMassDTO findNameMass(int id);
}
