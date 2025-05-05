package Apartado_1_4.Ejercicio3;

import java.util.ArrayList;

public class MiClase{
    private ArrayList array;
    private int num;
    public MiClase(int i){
        array = new ArrayList(i);
        for (int c = 0; c < i; c++){
            array.add(c);
        }
        num = array.size();
    }
    public String toString(){
        return array +" .Número de elementos en el array: " + num ;
    }
}
