
DROP TABLE IF EXISTS ODONTOLOGOS;


CREATE TABLE ODONTOLOGOS (
                             ID INT AUTO_INCREMENT PRIMARY KEY,
                             NUMERO_MATRICULA VARCHAR(10) NOT NULL,
                             NOMBRE VARCHAR(10) NOT NULL,
                             APELLIDO VARCHAR(10) NOT NULL
);
