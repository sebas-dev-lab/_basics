package oop.Intro;

public class Dog {
    String raza;
    String nombre;
    String du;
    int age;

    void atributes(String nombre, String raza, String du, int age) {
        this.nombre = nombre;
        this.raza = raza;
        this.du = du;
        this.age = age;

    }

    void eat() {
        System.out.println("Eating");
    }

    void gulf() {
        System.out.println("Gulf");

    }

    void sleep() {
        System.out.println("Sleep");

    }

}
