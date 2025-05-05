package Apartado_1_4.Ejercicio4;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private int curso;
    public Estudiante(String nombre, String apellido, int edad, int curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
    }
    public String toString() {
        return nombre + " ," + apellido + ", Edad: " + edad + ", Curso: " + curso;
    }
}
