package Apartado_1_4.Ejercicio4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AsignaturaTest {
    Estudiante e1 = new Estudiante("e1","e1",1,1);
    Estudiante e2 = new Estudiante("e2","e2",2,2);
    Estudiante e3 = new Estudiante("e3","e3",3,3);
    Asignatura as = new Asignatura();
    @Test
    void agregarEstudiante() {
        as.agregarEstudiante(e1);
        as.agregarEstudiante(e2);
        as.agregarEstudiante(e3);
        assertEquals("["+e1+", "+e2+", "+e3+"]", as.toString());

    }

    @Test
    void testToString() {
    }
}