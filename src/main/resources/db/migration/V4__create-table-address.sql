CREATE TABLE t_event_address (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    street_id UUID NOT NULL,
    address VARCHAR(255) NOT NULL,
    number VARCHAR(10) NOT NULL,
    complement VARCHAR(120),
    CONSTRAINT fk_address_street FOREIGN KEY (street_id)
        REFERENCES t_event_street (id)
);