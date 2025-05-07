package Apartado_1_3;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prueba_PersonaTest {

    @Test
    void main() {
        Gson gson = new Gson();
        Persona p = new Persona("Antonio Moratilla",97);
        String json = gson.toJson(p);
        assertEquals("{\"nombre\":\"Antonio Moratilla\",\"edad\":97}",json);
    }
}