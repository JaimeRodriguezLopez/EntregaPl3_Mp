package Apartado_1_4.Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1_ProgramaPrincipalTest {

    @Test
    void guardarYLeerObjeto() {
        Person p = new Person("John", "direccionDeTest");
        Ejercicio1_ProgramaPrincipal.guardarObjeto(p, "ObjTets.json");
        Person p2 = Ejercicio1_ProgramaPrincipal.leerObjeto(Person.class, "ObjTets.json");
        assertEquals(p.toString(), p2.toString());
        Ejercicio1_ProgramaPrincipal.guardarObjeto(p2, "");
        assertEquals(null, Ejercicio1_ProgramaPrincipal.leerObjeto(Person.class, ""));
        //Las clases estan testeadas en la entega correspondiente
    }
}