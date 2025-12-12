package com.appdev.project.daos;


import com.appdev.project.entities.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanetRepo extends JpaRepository<Planet, Integer> {
    List<Planet> findByType(String type);
}
