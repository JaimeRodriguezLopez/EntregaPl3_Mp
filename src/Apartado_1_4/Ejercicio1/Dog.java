package Apartado_1_4.Ejercicio1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void greeting() {
        System.out.println("Woof");
    }

    // Sobrecarga del método greeting para otro perro
    public void greeting(Dog another) {
        System.out.println("Wooof");
    }
}
