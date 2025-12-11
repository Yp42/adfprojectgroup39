package com.appdev.project.controllers;

import com.appdev.project.dtos.PlanetDTO;
import com.appdev.project.service.PlanetService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/planets")
public class PlanetController {
    private PlanetService planetService;

    @GetMapping({"/", ""})
    public List<PlanetDTO> findAllPlanets() {
        return planetService.findAll();
    }

    @PostMapping({"/", ""})
    public void createPlanet(@Valid @RequestBody PlanetDTO planetDTO) {
        planetService.createPlanet(planetDTO);
    }

    @GetMapping({"/{name}", "/{name}/"})
    public PlanetDTO findPlanetById(@PathVariable int id) {
        return planetService.findPlanetById(id);
    }
}