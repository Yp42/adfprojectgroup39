package com.appdev.project.service;

import com.appdev.project.daos.PlanetRepo;
import com.appdev.project.entities.Planet;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlanetServiceImpl implements PlanetService {

    private PlanetRepo planetRepo;

    @Override
    public List<Planet> findAll() {
        return planetRepo.findAll();
    }
}
