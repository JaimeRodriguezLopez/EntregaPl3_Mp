package Apartado_1_4.Ejercicio1;

public class Rectangle {
    private float altura;
    private float anchura;
    public Rectangle(){
        altura = 1.0f;
        anchura = 1.0f;
    }
    public Rectangle(float al, float an){
        altura = al;
        anchura = an;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float al){
        altura = al;
    }
    public float getAnchura(){
        return anchura;
    }
    public void setAnchura(float an){
        anchura = an;
    }
    public double getArea(){
        return altura * anchura;
    }
    public double getPerimetro(){
        return (2 * altura) + (2 * anchura);
    }
    public String toString(){
        return "Rectangulo[Altura = " + altura + ", Anchura = " + anchura + " ]";
    }
}
