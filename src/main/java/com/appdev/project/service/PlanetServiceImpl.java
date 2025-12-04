package com.appdev.project.service;

import com.appdev.project.daos.PlanetRepo;
import com.appdev.project.dtos.Mappers;
import com.appdev.project.dtos.PlanetDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@AllArgsConstructor
public class PlanetServiceImpl implements PlanetService {

//    Add a new planet to the database. TODO
//    Retrieve all planets.
//    Retrieve a planet by its unique ID. TODO
//    Update the details of an existing planet (e.g., change its mass). TODO
//    Remove a planet from the database by its unique ID. TODO
//    Retrieve planets based on their type (e.g., gas giant, terrestrial). TODO
//    Retrieve specific fields of a planet (e.g., only name and mass_kg for use in other parts
//    of the application). TODO

    private PlanetRepo planetRepo;

    @Override
    public List<PlanetDTO> findAll() {
        return planetRepo
                .findAll()
                .stream()
                .map(Mappers::mapPlanetToPlanetDTO)
                .toList();
    }

    @Override
    public void createPlanet(@RequestBody PlanetDTO planetDTO) {
        planetRepo.save(Mappers.mapPlanetDTOtoPlanet(planetDTO));
    }
}