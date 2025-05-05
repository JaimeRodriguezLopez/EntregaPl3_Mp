package Apartado_1_4.Ejercicio3;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipalArray {
    static <T> void guardarArray(ArrayList<T> array, String ruta){
        Gson gson = new Gson();
        try(FileWriter fw = new FileWriter(ruta)){
            gson.toJson(array,fw);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    static <T> ArrayList<T> lerArray(String ruta){
        Gson gson = new Gson();
        try(FileReader fr = new FileReader(ruta)){
            return gson.fromJson(fr,ArrayList.class);
        }
        catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        if(((!args[0].equals("init"))&&(!args[0].equals("show")))|| args.length != 2){
            System.out.println("Error: El primer parametro ha de corresponder a: init/show y el segundo a la ruta, no pueden ser vacíos");
        }
        else if(args[0].equals("init")){
            ArrayList<Integer> lista = new ArrayList<>(4);
            lista.add(0);
            lista.add(1);
            lista.add(2);
            lista.add(3);
            guardarArray(lista,args[1]);
            System.out.println("Se ha guardado el array: " + lista + ". En la ruta: " + args[1]);
        }
        else{
            System.out.println("Se ha leido: " + lerArray(args[1]));
        }
    }

}
