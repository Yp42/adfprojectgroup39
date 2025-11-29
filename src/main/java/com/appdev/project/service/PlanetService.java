package com.appdev.project.service;

import com.appdev.project.daos.Planet;

import java.util.List;

public interface PlanetService {
    List<Planet> findAll();
}
