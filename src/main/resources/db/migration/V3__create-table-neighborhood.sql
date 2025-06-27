CREATE TABLE t_event_neighborhood (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    city_id UUID NOT NULL,
    name VARCHAR(255) NOT NULL,
    CONSTRAINT fk_street_city FOREIGN KEY (city_id)
        REFERENCES t_event_city (id)
);