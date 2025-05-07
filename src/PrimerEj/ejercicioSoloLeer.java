package PrimerEj;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ejercicioSoloLeer {
    // Clase Usuario para los ejemplos
    static class Usuario {
        String nombre;
        int edad;
        String correo;
        public Usuario(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }
// Getters y setters no incluidos por brevedad

    }
    public static void main(String[] args) {
        Gson gson = new Gson();
        Usuario usuarioCargado = null;
        try (FileReader r = new FileReader("src/PrimerEj/MiJson.json")) {
            usuarioCargado = gson.fromJson(r, Usuario.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (usuarioCargado != null){
            System.out.println("Usuario cargado = " + usuarioCargado.nombre);
        }


    }
    //Efectivamente, la salida es la misma que en el ejercicio anterior.
}
