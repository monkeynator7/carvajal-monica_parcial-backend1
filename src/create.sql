DROP TABLE IF EXISTS ODONTOLOGOS;

CREATE TABLE ODONTOLOGOS (
                             ID INT IDENTITY PRIMARY KEY,
                             NUMERO_MATRICULA VARCHAR(10) NOT NULL,
                             NOMBRE VARCHAR(10) NOT NULL,
                             APELLIDO VARCHAR(10) NOT NULL
);
