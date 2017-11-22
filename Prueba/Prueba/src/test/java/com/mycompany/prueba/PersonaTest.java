/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formacion
 */
public class PersonaTest {

    private static final Logger LOG = Logger.getLogger(PersonaTest.class.getName());

    private Persona persona;

    public PersonaTest() {
        persona = new Persona();
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
        LOG.info("AfterClass");
    }

    @Before
    public void setUp() {
        LOG.info("Before");
    }

    @After
    public void tearDown() {
        persona = new Persona();
        LOG.info("After");
    }

    @Test(expected = NullPointerException.class)
    public void nombreNull() {
        LOG.log(Level.INFO, "nombreNull persona {0}", persona);
        assertTrue(persona.getNombre().length() > 5);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test(expected = NullPointerException.class)
    public void nombreUpperCaseNPE() {
        LOG.log(Level.INFO, "nombreUpperCaseNPE persona {0}", persona);
        LOG.log(Level.INFO, "persona.getNombre().toUpperCase() {0}", persona.getNombre().toUpperCase());
    }

    @Test
    public void nombreLongitud() {
        LOG.log(Level.INFO, "nombreLongitud persona {0}", persona);
        persona.setNombre("Nombre personaaaa");
        assertTrue(persona.getNombre().length() > 5);
    }
}
