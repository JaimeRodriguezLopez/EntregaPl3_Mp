package Apartado_1_4.Ejercicio4;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramaPrincipalGuardarAsignatura {
    static void guardarAsignatura(Asignatura asignatura,String ruta) {
        Gson gson = new Gson();
        try(FileWriter fw = new FileWriter(ruta)) {
            gson.toJson(asignatura, fw);
            System.out.println("Se ha guardado la asignatura: " + asignatura.toString() + "En la ruta: " + ruta);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    static Asignatura leerAsignatura(String ruta) {
        Gson gson = new Gson();
        try(FileReader fr = new FileReader(ruta)) {
            return gson.fromJson(fr, Asignatura.class);
        }
        catch(IOException e){
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        if((((!args[0].equals("init")))&&(!args[0].equals("show")))||args.length!=2){
            System.out.println("Parametros incorrectos");
        }
        else if(args[0].equals("init")){
            Asignatura asignatura = new Asignatura();
            Estudiante e1 = new Estudiante("Ruben","Martinez",18,1);
            Estudiante e2 = new Estudiante("Paula","Gomez",19,1);
            Estudiante e3 = new Estudiante("Jaime","Rodriguez",18,1);
            asignatura.agregarEstudiante(e1);
            asignatura.agregarEstudiante(e2);
            asignatura.agregarEstudiante(e3);
            guardarAsignatura(asignatura, args[1]);
            System.out.println("Se ha guardado la asignatura");
        }
        else{
            System.out.println("Se ha leído: " + leerAsignatura(args[1]));
        }
    }
}
