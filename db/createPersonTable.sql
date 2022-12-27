CREATE TABLE IF NOT EXISTS person
(
    id       serial PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    age      int,
    title    VARCHAR(256)       not null
);