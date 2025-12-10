package com.appdev.project.daos;

import com.appdev.project.entities.Moon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoonRepo extends JpaRepository<Moon, Integer> {

    @Query("SELECT m FROM Moon m WHERE LOWER(m.planet.name) = LOWER(:name)")
    List<Moon> findByPlanetName(String name);

    @Query("SELECT COUNT(m) FROM Moon m WHERE m.planet.planetId = :planetId")
    int countMoonsByPlanetId(int planetId);
}
