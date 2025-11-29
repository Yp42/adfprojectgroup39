package com.appdev.project.service;

import com.appdev.project.daos.Planet;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlanetServiceImpl implements PlanetService {
    @Override
    public List<Planet> findAll() {
        return null;
    }
}
