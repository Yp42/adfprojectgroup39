package com.appdev.project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Moon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int moonId;
    String name;
    int diameterKm;
    int orbitalPeriodDays;

    @ManyToOne
    @JoinColumn(name = "planet_id")
    Planet planet;
}
