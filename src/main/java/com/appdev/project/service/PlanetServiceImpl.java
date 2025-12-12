package com.appdev.project.service;

import com.appdev.project.daos.PlanetRepo;
import com.appdev.project.dtos.Mappers;
import com.appdev.project.dtos.PlanetDTO;
import com.appdev.project.dtos.PlanetNameMassDTO;
import com.appdev.project.entities.Planet;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@AllArgsConstructor
public class PlanetServiceImpl implements PlanetService {

//    Add a new planet to the database.
//    Retrieve all planets.
//    Retrieve a planet by its unique ID.
//    Update the details of an existing planet (e.g., change its mass). TODO
//    Remove a planet from the database by its unique ID.
//    Retrieve planets based on their type (e.g., gas giant, terrestrial).
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

    @Override
    public PlanetDTO findPlanetById(int id) {
        Planet p = planetRepo.findById(id).orElseThrow(() -> new RuntimeException("Planet not found"));

        return Mappers.mapPlanetToPlanetDTO(p);
    }

    @Override
    public void deletePlanetByID(int id) {
        if (!planetRepo.existsById(id)) {
            throw new RuntimeException("Planet not found");
        }
        planetRepo.deleteById(id);
    }

    @Override
    public List<PlanetDTO> findByType(String type) {
        return planetRepo
                .findByType(type)
                .stream()
                .map(Mappers::mapPlanetToPlanetDTO)
                .toList();
    }

    @Override
    public PlanetNameMassDTO findNameMass(int id) {
        if (!planetRepo.existsById(id)) {
            throw new RuntimeException("Planet not found");
        }
        String[] res = planetRepo.findNameMass(id).split(",");

        return new PlanetNameMassDTO(res[0], Double.parseDouble(res[1]));
    }
}