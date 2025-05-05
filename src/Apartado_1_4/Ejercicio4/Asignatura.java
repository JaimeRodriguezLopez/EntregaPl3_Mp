package Apartado_1_4.Ejercicio4;

import java.util.ArrayList;

public class Asignatura {
    private ArrayList<Estudiante> estudiantes;
    public Asignatura() {
        estudiantes = new ArrayList<>();
    }
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    public String toString(){
        return estudiantes.toString();
    }
}
