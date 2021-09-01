package oop.oop_7;

public class Circle extends Figure {

    public static final float pi = 3.1415f;
    private float r;

    public Circle(float r) {
        this.r = r;
    }

    @Override
    public float a() {
        return Circle.pi * (this.r * this.r);
    }

}
