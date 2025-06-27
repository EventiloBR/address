CREATE TABLE t_event_address (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    neighborhood_id UUID NOT NULL,
    address VARCHAR(255) NOT NULL,
    number VARCHAR(10) NOT NULL,
    complement VARCHAR(120),
    CONSTRAINT fk_address_street FOREIGN KEY (neighborhood_id)
        REFERENCES t_event_neighborhood (id)
);