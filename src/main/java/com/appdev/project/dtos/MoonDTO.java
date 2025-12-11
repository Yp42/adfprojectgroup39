package com.appdev.project.dtos;

public record MoonDTO(
        int id,
        String name,
        int diameter,
        int orbitalPeriod,
        int planetId
) {}
