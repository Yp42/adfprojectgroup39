package com.appdev.project.daos;


import com.appdev.project.entities.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepo extends JpaRepository<Planet, Integer> {
    Planet findPlanetById(int id);
}
