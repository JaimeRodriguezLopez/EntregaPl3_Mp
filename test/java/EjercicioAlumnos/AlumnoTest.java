package EjercicioAlumnos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {
    Alumno alumno = new Alumno(19,"MeLoInvento",1);

    @Test
    void testToString() {
        assertEquals("MeLoInvento/19/1", alumno.toString());
    }
}