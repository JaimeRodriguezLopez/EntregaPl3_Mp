package Apartado_1_3;

import com.google.gson.Gson;

public class Prueba_Persona {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Persona p = new Persona("Antonio Moratilla",97);
        String json = gson.toJson(p);
        System.out.println(json);
    }
}

