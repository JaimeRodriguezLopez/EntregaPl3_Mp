package Apartado_1_4.Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramaPrincipalArrayDentroObjetoTest {

    @Test
    void guardarYLeerArrayDentroObjeto() {
        MiClase m = new MiClase(5);
        ProgramaPrincipalArrayDentroObjeto.guardarMiclase(m,"ArrayDentroDeObjTest.json");
        MiClase m2 = ProgramaPrincipalArrayDentroObjeto.leerMiClase("ArrayDentroDeObjTest.json");
        assertEquals("[0.0, 1.0, 2.0, 3.0, 4.0] .Número de elementos en el array: 5",m2.toString());
        //Si comparamos m y m2, no son iguales, pues, de nuevo, el array que devuelve json, se da con Numbers, y hemos metido enteros.
        ProgramaPrincipalArrayDentroObjeto.guardarMiclase(m,"");
        assertEquals(null,ProgramaPrincipalArrayDentroObjeto.leerMiClase(""));
    }
}