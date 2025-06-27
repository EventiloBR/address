CREATE TABLE t_event_city (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    state_id UUID NOT NULL,
    name VARCHAR(255) NOT NULL,
    CONSTRAINT fk_city_state FOREIGN KEY (state_id)
        REFERENCES t_event_state (id)
);