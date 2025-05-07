package Apartado_1_4.Ejercicio3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProgramaPrincipalArrayTest {

    @Test
    void guardarYLeerArray() {
        ArrayList lista = new ArrayList(3);
        lista.add(1.0);//Hay que ponerlos en formato number proque json solo contempla number, ni int ni double...
        lista.add(2.0);
        lista.add(3.0);
        ProgramaPrincipalArray.guardarArray(lista,"Array.json");
        ArrayList a2 = ProgramaPrincipalArray.lerArray("Array.json");
        assertEquals(lista.toString(), a2.toString());
        ProgramaPrincipalArray.guardarArray(lista,"");
        assertEquals(null, ProgramaPrincipalArray.lerArray(""));
    }


}