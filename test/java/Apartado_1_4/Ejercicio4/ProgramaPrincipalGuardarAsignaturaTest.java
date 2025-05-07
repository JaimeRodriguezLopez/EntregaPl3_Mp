package Apartado_1_4.Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramaPrincipalGuardarAsignaturaTest {
    Estudiante e1 = new Estudiante("e1","e1",1,1);
    Estudiante e2 = new Estudiante("e2","e2",2,2);
    Estudiante e3 = new Estudiante("e3","e3",3,3);
    Asignatura as = new Asignatura();
    @Test
    void guardarYLeerAsignatura() {
        as.agregarEstudiante(e1);
        as.agregarEstudiante(e2);
        ProgramaPrincipalGuardarAsignatura.guardarAsignatura(as,"TestAsignatura.json");
        Asignatura as2 = ProgramaPrincipalGuardarAsignatura.leerAsignatura("TestAsignatura.json");
        assertEquals(as.toString(),as2.toString());
        ProgramaPrincipalGuardarAsignatura.guardarAsignatura(as,"");
        assertEquals(null,ProgramaPrincipalGuardarAsignatura.leerAsignatura(""));
    }
}