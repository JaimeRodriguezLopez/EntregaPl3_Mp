package EjercicioAlumnos;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramaPrincipal_Alumno {
    static void guardarAlumno (String ruta, Alumno alumno) {
        Gson gson = new Gson();
        try(FileWriter w = new FileWriter(ruta)) {
            gson.toJson(alumno, w);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    static Alumno leerAlumno(String ruta) {
        Gson gson = new Gson();
        try(FileReader r = new FileReader(ruta)) {
            return gson.fromJson(r, Alumno.class);
        }
        catch(IOException e){
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        //Se han de introducir dos parametros: uno para el tipo de operacion y otro para la ruta
        if ( (!(args[0].equals("init")) && (!args[0].equals("show"))) || args.length < 2 ) {
            System.out.println("Los argumentos han de ser de la forma: <operacion> <ruta>");
        }
        String op = args[0];
        String ruta = args[1];
        if (op.equals("init")) {
            Alumno alumno_def = new Alumno(0,"Ruben",0);
            guardarAlumno(ruta,alumno_def);

        }
        else{
            System.out.println(leerAlumno(ruta));
        }
    }
}
