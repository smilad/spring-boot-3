CREATE TABLE users (
id BIGSERIAL PRIMARY KEY,
first_name VARCHAR(255) NOT NULL,
last_name varchar(255),
email VARCHAR(255) NOT NULL,
created_at TIMESTAMP DEFAULT now(),
created_at_utc TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW()
);