CREATE TABLE IF NOT EXISTS clients
(
    id    INTEGER  PRIMARY KEY ,
    name  VARCHAR(200) NOT NULL ,
    card VARCHAR(20)  NOT NULL ,
    cash double precision
);
CREATE SEQUENCE clients_id_seq START WITH 3 INCREMENT BY 1;
--DROP TABLE IF EXISTS clients;
--DROP SEQUENCE IF EXISTS clients_id_seq;