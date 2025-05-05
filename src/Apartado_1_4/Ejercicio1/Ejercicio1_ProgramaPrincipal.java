package Apartado_1_4.Ejercicio1;

import EjercicioAlumnos.Alumno;
import com.google.gson.Gson;

import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// vamos a usar args[3] para indicar la clase a guardar/leer.

public class Ejercicio1_ProgramaPrincipal {
    static <T> void guardarObjeto(T objeto, String ruta) {
        Gson gson = new Gson();
        try(FileWriter fw = new FileWriter(ruta)) {
            gson.toJson(objeto, fw);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    static <T> T leerObjeto(Class<T> clase,String ruta) {
        Gson gson = new Gson();
        try(FileReader fr = new FileReader(ruta)) {
            return gson.fromJson(fr, clase);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        if ((!(args[0].equals("init")) && !(args[0].equals("show"))) || args.length != 3) {
            System.out.println("Error: el primer parámetro ha de ser del tipo: init/show y el segundo/tercero no pueden ser vacíos.");
            return;
        }

        //Clases de la hoja EL1a: (Circle/Rectangle)
        else if (args[2].equals("Circle")){
            if (args[0].equals("init")) {
                Circle c = new Circle();
                guardarObjeto(c,args[1]);
                System.out.println("Se ha guardado el círculo: " + c + ". En la ruta: " + args[1]);
            }
            else{
                System.out.println("El círculo leído es: " + leerObjeto(Circle.class,args[1]));

            }
        }
        else if (args[2].equals("Rectangle")){
            if (args[0].equals("init")) {
                Rectangle r = new Rectangle();
                guardarObjeto(r,args[1]);
                System.out.println("Se ha guardado el rectángulo: " + r + ". En la ruta: " + args[1]);
            }
            else{
                System.out.println("El rectángulo leido es: " + leerObjeto(Rectangle.class,args[1]));
            }
        }
        //Clases de la hoja EL1b (Customer/Author)
        else if (args[2].equals("Customer")){
            if (args[0].equals("init")) {
                Customer cu = new Customer(103,"Ruben Martinez", 20);
                guardarObjeto(cu,args[1]);
                System.out.println("Se ha guardado el cliente: " + cu + ". En la ruta: " + args[1]);
            }
            else{
                System.out.println("El cliente leido es: " + leerObjeto(Customer.class,args[1]));
            }
        }
        else if (args[2].equals("Author")){
            if (args[0].equals("init")) {
                Author au = new Author("Ruben Martinez", "correofalso@gmail.com");
                guardarObjeto(au,args[1]);
                System.out.println("Se ha guardado el autor: " + au + ". En la ruta: " + args[1]);
            }
            else{
                System.out.println("El autor leido es: " + leerObjeto(Author.class,args[1]));
            }
        }
        //Clases de la hoja EL1c (Animal/Person)
        else if (args[2].equals("Animal")){
            if (args[0].equals("init")) {
                Animal an = new Animal("Perro");
                guardarObjeto(an,args[1]);
                System.out.println("Se ha guardado el animal: " + an + ". En la ruta: " + args[1]);
            }
            else{
                System.out.println("El animal leido es: " + leerObjeto(Animal.class,args[1]));
            }
        }
        else if (args[2].equals("Person")){
            if (args[0].equals("init")) {
                Person p = new Person("Pablito","direccionfalsa");
                guardarObjeto(p,args[1]);
                System.out.println("Se ha guardado la persona: " + p + ". En la ruta: " + args[1]);
            }
            else{
                System.out.println("La persona leida es: " + leerObjeto(Person.class,args[1]));
            }
        }
        //Clases de la hoja EL1d (Dog/Cat)
        else if (args[2].equals("Dog")){
            if (args[0].equals("init")) {
                Dog d = new Dog("Coco");
                guardarObjeto(d,args[1]);
                System.out.println("Se ha guardado el perro: " + d + ". En la ruta: " + args[1]);
            }
            else{
                System.out.println("El perro leido es: " + leerObjeto(Dog.class,args[1]));
            }
        }
        else if (args[2].equals("Cat")){
            if (args[0].equals("init")) {
                Cat c = new Cat("Patrick");
                guardarObjeto(c,args[1]);
                System.out.println("Se ha guardado el gato: " + c + ". En la ruta: " + args[1]);
            }
            else{
                System.out.println("El gato leido es: " + leerObjeto(Cat.class,args[1]));
            }
        }
        //Si el tercer parametro no corresponde a ninguna de dichas clases:
        else{
            System.out.println("El tercer parámetro debe corresponder a una de las siguientes opciones de clases:");
            System.out.println("Animal, Author, Cat, Circle, Customer, Dog, Person, Rectangle");
        }
        }
    }
