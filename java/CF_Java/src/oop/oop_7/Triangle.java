package oop.oop_7;

public class Triangle extends Figure {
    // Para heredar de metodo abstracto debemos heredar sus metodos.
    // Sobreescribimos el metodos y eliminamos la palabra abstract.
    private float base;
    private float heigth;

    public Triangle(float base, float heigth) {
        this.base = base;
        this.heigth = heigth;
    }

    @Override
    public float a() {
        return (base * heigth) / 2;
    };
}
