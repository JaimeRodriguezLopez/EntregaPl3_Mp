package Apartado_1_4.Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramaPrincipal_Ejercicio2Test {

    @Test
    void guardarYLeerLibro() {
        Author a = new Author("Lorca","Lorca@gmail.com");
        Book b = new Book("1205","DaliTeAmo",a,150.5);
        ProgramaPrincipal_Ejercicio2.guardarLibro(b,"LIbroTest.json");
        Book b2 = ProgramaPrincipal_Ejercicio2.leerLibro("LIbroTest.json");
        assertEquals(b.toString(),b2.toString());
        ProgramaPrincipal_Ejercicio2.guardarLibro(b,"");
        assertEquals(null,ProgramaPrincipal_Ejercicio2.leerLibro(""));
    }

}