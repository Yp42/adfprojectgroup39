package com.appdev.project.controllers;

import com.appdev.project.daos.Planet;
import com.appdev.project.service.PlanetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/planets")
public class PlanetController {
    private PlanetService planetService;

    @GetMapping({"/", ""})
    public List<Planet> findAllPlanets() {
        return planetService.findAll();
    }
}