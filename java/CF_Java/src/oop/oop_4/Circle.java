package oop.oop_4;

public class Circle {

    public static final float pi = 3.141592f; // Podemos usarlo sin instanciar. Pasa a pertenecer a la calse y no al objeto. 

    public float r = 0f; //Atributo de instancia

    // // Constructor
    // public Circle(float r) { 
    //     this.r = r;
    // }

    public static float aCircle(float r) { //Metodo de instancia
        return Circle.pi * (r * r);//Circle.pi => buenas practicas static


    }
}
