CREATE TABLE repostas (
    topico_id BIGINT NOT NULL,
    repostas VARCHAR(255) NULL,
    FOREIGN KEY (topico_id) REFERENCES topicos(id)
);