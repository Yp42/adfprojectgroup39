INSERT INTO PLANET (NAME, TYPE, MASS_KG, RADIUS_KM, ORBITAL_PERIOD_DAYS)
VALUES
    ('Mercury', 'Terrestrial', 0.33011, 2440, 88),
    ('Venus', 'Terrestrial', 4.8675, 6052, 225),
    ('Earth', 'Terrestrial', 5.97237, 6371, 365),
    ('Mars', 'Terrestrial', 0.64171, 3389, 687),
    ('Jupiter', 'Gas Giant', 1898.2, 69911, 4333),
    ('Saturn', 'Gas Giant', 568.34, 58232, 10759),
    ('Uranus', 'Ice Giant', 86.81, 25362, 30687),
    ('Neptune', 'Ice Giant', 102.413, 24622, 60190);

INSERT INTO MOON (NAME, DIAMETER_KM, ORBITAL_PERIOD_DAYS, PLANET_ID)
VALUES
    ('Moon', 3475, 27, 3),
    ('Phobos', 22, 0, 4),
    ('Io', 3643, 2, 5),
    ('Europa', 3122, 4, 5),
    ('Titan', 5150, 16, 6);


INSERT INTO USERS (USERNAME, PASSWORD, ROLE, ENABLED)
VALUES
    ('admin', '$2a$10$H4eNgu8k1ZQUHnCJnxGcauShNIm5rgQxwDcHLHBr4M7OH6Ltw/LJW', 'ADMIN', true),
    ('staff', '$2a$10$H4eNgu8k1ZQUHnCJnxGcauShNIm5rgQxwDcHLHBr4M7OH6Ltw/LJW', 'STAFF', true),
    ('student', '$2a$10$H4eNgu8k1ZQUHnCJnxGcauShNIm5rgQxwDcHLHBr4M7OH6Ltw/LJW', 'STUDENT', true);
