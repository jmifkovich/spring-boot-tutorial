DROP TABLE people IF EXISTS;

CREATE TABLE people (
                      id         INTEGER IDENTITY PRIMARY KEY,
                      first_name VARCHAR(30),
                      last_name  VARCHAR(30)
);

CREATE INDEX people_lastName ON people (lastName);