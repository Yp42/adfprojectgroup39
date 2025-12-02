package com.appdev.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int planetId;
    String name;
    String type;
    int radiusKm;
    double massKg; // divided by 10^24 for readability
    int orbitalPeriodDays;
}
