package com.appdev.project.service;

import com.appdev.project.dtos.MoonDTO;

import java.util.List;

public interface MoonService {

    void createMoon(MoonDTO dto);

    List<MoonDTO> findAll();

    MoonDTO findById(int id);

    void deleteMoon(int id);

    List<MoonDTO> findByPlanetName(String name);

    int countMoons(int planetId);
}
