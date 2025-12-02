package com.appdev.project.service;

import com.appdev.project.dtos.PlanetDTO;

import java.util.List;

public interface PlanetService {
    List<PlanetDTO> findAll();
}
