package test;

import dao.impl.DaoEnMemoria;
import service.ServiceOdontologo;
import model.Odontologo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.apache.log4j.Logger;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.junit.jupiter.api.Assertions.*;

class testOdontologoEnMemoria {
    static final Logger logger = Logger.getLogger(testOdontologoEnMemoria.class);


    @Test
    @DisplayName("Prueba listar todos los odontologos en memoria")
    void case1() {
        DaoEnMemoria daoEnMemoria = new DaoEnMemoria();
        ServiceOdontologo serviceOdontologo = new ServiceOdontologo(daoEnMemoria);
        Odontologo odontologo1 = new Odontologo("123456", "BOB", "ESPONKA");
        Odontologo odontologo2 = new Odontologo("123457", "PEDRO", "MALO");
        Odontologo odontologo3 = new Odontologo("1234568", "PEPE", "ZAPATO");
        Odontologo odontologo1Memoria = serviceOdontologo.save(odontologo1);
        Odontologo odontologo2Memoria = serviceOdontologo.save(odontologo2);
        Odontologo odontologo3Memoria = serviceOdontologo.save(odontologo3);
        assertNotNull(daoEnMemoria.listarTodos());
        logger.info(daoEnMemoria.listarTodos());

    }
}