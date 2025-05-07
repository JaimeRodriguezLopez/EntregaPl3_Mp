package EjercicioAlumnos;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class ProgramaPrincipal_AlumnoTest {

    @Test
    void guardaryLeerAlumno() {
        Alumno a = new Alumno(18, "MeLoInvento", 1);
        ProgramaPrincipal_Alumno.guardarAlumno("Alumno.json", a);
        Alumno a2 = ProgramaPrincipal_Alumno.leerAlumno("Alumno.json");
        assertEquals(a.toString(), a2.toString());
        File inex = new File("");
        ProgramaPrincipal_Alumno.guardarAlumno("",a);
        assertEquals(false,inex.exists());
        ProgramaPrincipal_Alumno.leerAlumno("");
    }
}