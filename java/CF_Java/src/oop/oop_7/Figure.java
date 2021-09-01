package oop.oop_7;

public abstract class Figure {
    // Clase abstracta => debe poseer al menos un metodo abstracto.

    private int numberSides;

    public Figure() {
        this.numberSides = 0;
    }

    // metodo abstracto
    public abstract float a();
}
