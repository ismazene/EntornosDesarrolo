package org.example.EntornosDesarrollo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlienTest {

    @Test
    void testConstructor() {
        Alien alien = new Alien("Zorg", "MARS01");

        assertEquals("Zorg", alien.getName());
        assertEquals("MARS01", alien.getPlanetId());
    }

    @Test
    void testSetName() {
        Alien alien = new Alien();

        alien.setName("Xenomorph");

        assertEquals("Xenomorph", alien.getName());
    }

    @Test
    void testSetPlanetId() {
        Alien alien = new Alien();

        alien.setPlanetId("LV426");

        assertEquals("LV426", alien.getPlanetId());
    }

    @Test
    void testEqualsTrue() {
        Alien alien1 = new Alien("Zorg", "MARS01");
        Alien alien2 = new Alien("Xeno", "MARS01");

        assertTrue(alien1.equals(alien2));
    }

    @Test
    void testEqualsFalse() {
        Alien alien1 = new Alien("Zorg", "MARS01");
        Alien alien2 = new Alien("Xeno", "MARS02");

        assertFalse(alien1.equals(alien2));
    }

    @Test
    void testToString() {
        Alien alien = new Alien("Zorg", "MARS01");

        assertEquals("Zorg MARS01", alien.toString());
    }

    /// Este es el test con el qu ese hace la penultima captura
//    @Test
//    void testError() {
//        Alien alien = new Alien("Zorg", "MARS01");
//
//        assertEquals("Pedro", alien.getName());
//    }

}