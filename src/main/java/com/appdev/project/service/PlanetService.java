package com.appdev.project.service;

import com.appdev.project.dtos.PlanetDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PlanetService {
    List<PlanetDTO> findAll();

    void createPlanet(@RequestBody PlanetDTO planetDTO);

    PlanetDTO findPlanetById(@PathVariable int id);
}
