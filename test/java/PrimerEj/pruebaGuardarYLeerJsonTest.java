package PrimerEj;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class pruebaGuardarYLeerJsonTest {

    @Test
    void guardarObjetoEnArchivoyCargar() {
        pruebaGuardarYLeerJson.guardarObjetoEnArchivo("PruebaGuardarYLeerTest.json",18);
        File file = new File("PruebaGuardarYLeerTest.json");
        assertEquals(true,file.exists());
        pruebaGuardarYLeerJson.guardarObjetoEnArchivo("",18);
        File file2 = new File("");
        assertEquals(false,file2.exists());
        Number n = pruebaGuardarYLeerJson.cargarObjetoDesdeArchivo("PruebaGuardarYLeerTest.json",Number.class);
        assertEquals((Number)18,n.intValue());
        String rutaInex = "";
        pruebaGuardarYLeerJson.cargarObjetoDesdeArchivo(rutaInex,Object.class);
        File file3 = new File(rutaInex);
        assertEquals(false,file3.exists());
    }
    @Test
    void UsuarioTest(){
        pruebaGuardarYLeerJson.Usuario u = new pruebaGuardarYLeerJson.Usuario("NombrePrueba",18,"correoprueba@gmail.com");
        assertEquals("NombrePrueba",u.nombre);
        assertEquals("correoprueba@gmail.com",u.correo);
        assertEquals(18,u.edad);
    }
}