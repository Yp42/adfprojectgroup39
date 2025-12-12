package com.appdev.project.service;

import com.appdev.project.daos.MoonRepo;
import com.appdev.project.daos.PlanetRepo;
import com.appdev.project.dtos.MoonDTO;
import com.appdev.project.entities.Moon;
import com.appdev.project.entities.Planet;
import com.appdev.project.exceptions.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MoonServiceImpl implements MoonService {

    private MoonRepo moonRepo;
    private PlanetRepo planetRepo;

    @Override
    public void createMoon(MoonDTO dto) {

        Planet planet = planetRepo.findById(dto.planetId())
                .orElseThrow(() ->
                        new ResourceNotFoundException("Planet not found: " + dto.planetId())
                );

        Moon moon = new Moon(
                0,
                dto.name(),
                dto.diameter(),
                dto.orbitalPeriod(),
                planet
        );

        moonRepo.save(moon);
    }

    @Override
    public List<MoonDTO> findAll() {
        return moonRepo.findAll()
                .stream()
                .map(m -> new MoonDTO(
                        m.getMoonId(),
                        m.getName(),
                        m.getDiameterKm(),
                        m.getOrbitalPeriodDays(),
                        m.getPlanet().getPlanetId()
                ))
                .toList();
    }

    @Override
    public MoonDTO findById(int id) {
        Moon m = moonRepo.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Moon not found: " + id)
                );

        return new MoonDTO(
                m.getMoonId(),
                m.getName(),
                m.getDiameterKm(),
                m.getOrbitalPeriodDays(),
                m.getPlanet().getPlanetId()
        );
    }

    @Override
    public void deleteMoon(int id) {
        if (!moonRepo.existsById(id)) {
            throw new ResourceNotFoundException("Moon not found: " + id);
        }
        moonRepo.deleteById(id);
    }

    @Override
    public List<MoonDTO> findByPlanetName(String name) {
        return moonRepo.findByPlanetName(name)
                .stream()
                .map(m -> new MoonDTO(
                        m.getMoonId(),
                        m.getName(),
                        m.getDiameterKm(),
                        m.getOrbitalPeriodDays(),
                        m.getPlanet().getPlanetId()
                ))
                .toList();
    }

    @Override
    public int countMoons(int planetId) {
        return moonRepo.countMoonsByPlanetId(planetId);
    }
}
