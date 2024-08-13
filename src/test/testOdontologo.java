package test;

import dao.impl.OdontologoDAOH2;
import org.junit.jupiter.api.BeforeAll;
import service.ServiceOdontologo;
import model.Odontologo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class testOdontologo {

    static final Logger logger = Logger.getLogger(testOdontologo.class);
    ServiceOdontologo serviceOdontologo = new ServiceOdontologo(new OdontologoDAOH2());

    @BeforeAll
    static void createTables(){
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:./carvajal-monica_parcial-backend1.database;INIT=RUNSCRIPT FROM 'src/db/create.sql'", "od", "od");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                logger.error(e.getMessage());
            }
        }
    }

    @Test
    @DisplayName("Prueba listar odontologos BD")
    void case1(){
        Odontologo odontologoA = new Odontologo("181471409","MONICA","CARVAJAL");
        Odontologo odontologoB = new Odontologo("108071419","ANDREA","ROMERO");
        Odontologo odontologoC = new Odontologo("123456778","BOB","ESPONJA");
        Odontologo odontologoADB = serviceOdontologo.save(odontologoA);
        Odontologo odontologoBDB = serviceOdontologo.save(odontologoB);
        Odontologo odontologoCDB = serviceOdontologo.save(odontologoC);
        List<Odontologo> odontologos;
        odontologos = serviceOdontologo.findAll();
        assertNotNull(odontologos);
        logger.info(odontologos);
    }


}