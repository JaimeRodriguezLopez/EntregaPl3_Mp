package Apartado_1_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    Persona p = new Persona("RubenTest",18);

    @Test
    void getNombre() {
        assertEquals("RubenTest",p.getNombre());
    }

    @Test
    void setNombre() {
        p.setNombre("RubenTest2");
        assertEquals("RubenTest2",p.getNombre());
    }

    @Test
    void getEdad() {
        assertEquals(18,p.getEdad());
    }

    @Test
    void setEdad() {
        p.setEdad(19);
        assertEquals(19,p.getEdad());
    }
}