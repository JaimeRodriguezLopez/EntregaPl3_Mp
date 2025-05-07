package PrimerEj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ejercicioSoloLeerTest {
    @Test
    void testUsuario() {
        ejercicioSoloLeer.Usuario u = new ejercicioSoloLeer.Usuario("NombrePrueba",18,"correoprueba@gmail.com");
        assertEquals("NombrePrueba",u.nombre);
        assertEquals("correoprueba@gmail.com",u.correo);
        assertEquals(18,u.edad);
    }
}