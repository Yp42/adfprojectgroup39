package com.appdev.project.entities;

import jakarta.persistence.Entity;
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
    int planetId;
    String name;
    String type;
    int radiusKm;
    double massKg; // divided by 10^24 for readability
    int orbitalPeriodDays;
}
