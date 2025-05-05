package Apartado_1_4.Ejercicio2;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramaPrincipal_Ejercicio2 {
    //Para intentar guardar un objeto dentro de otro, vamos a aprovechar las clases author y book que hicimos en las primeras hojas de clase.
    static void guardarLibro(Book libro, String ruta){
        Gson gson = new Gson();
        try(FileWriter fw = new FileWriter(ruta)){
            gson.toJson(libro,fw);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    static Book leerLibro(String ruta){
        Gson gson = new Gson();
        try(FileReader fr = new FileReader(ruta)){
            return gson.fromJson(fr,Book.class);
        }
        catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        if((!(args[0].equals("init")))&&(!(args[0].equals("show"))) || args.length != 2){
            System.out.println("Error: El primer parámetro ha de corresponder con las operaciones init/show y el segundo parámetro es la ruta, y no puede ser vacía.");
        }
        else if(args[0].equals("show")){
            System.out.println("El libro leído es: " + leerLibro(args[1]));
        }
        else if(args[0].equals("init")){
            //Vamos a crear un autor y un libro por defecto para guardarlos:
            Author autor = new Author("Miguel Delibes","meloinvento@gmail.es");
            Book libro = new Book("1350","La sombra del ciprés es alargada",autor,130.5);
            guardarLibro(libro,args[1]);
            System.out.println("Se ha guardado el libro: " + libro + ". En la ruta: " + args[1]);
        }

    }
}
