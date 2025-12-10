package com.appdev.project.controllers;

import com.appdev.project.dtos.MoonDTO;
import com.appdev.project.service.MoonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/moons")
public class MoonController {

    private MoonService moonService;

    @PostMapping
    public void createMoon(@RequestBody MoonDTO dto) {
        moonService.createMoon(dto);
    }

    @GetMapping
    public List<MoonDTO> findAll() {
        return moonService.findAll();
    }

    @GetMapping("/{id}")
    public MoonDTO findById(@PathVariable int id) {
        return moonService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        moonService.deleteMoon(id);
    }

    @GetMapping("/byPlanet/{name}")
    public List<MoonDTO> findByPlanetName(@PathVariable String name) {
        return moonService.findByPlanetName(name);
    }

    @GetMapping("/count/{planetId}")
    public int count(@PathVariable int planetId) {
        return moonService.countMoons(planetId);
    }
}
