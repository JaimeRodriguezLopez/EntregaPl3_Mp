package EjercicioAlumnos;

public class Alumno {
    private int edad;
    private String nombre;
    private int curso;
    public Alumno(int edad, String nombre, int curso) {
        this.edad = edad;
        this.nombre = nombre;
        this.curso = curso;
    }
    public String toString() {
        return nombre+"/"+edad+"/"+curso;
    }
}
