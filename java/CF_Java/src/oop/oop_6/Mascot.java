package oop.oop_6;

public class Mascot {

    public String name;
    public String race;
    public int age;

    // Constructor
    // COmo recibe parametros los hijos deben ejecutar super(...)
    public Mascot(String name, String race, int age){
        this.age = age;
        this.name = name;
        this.race = race;
    }

    public void sleep() {
        System.out.println("Is sleeping");
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }

    public void setData(String name, String race, int age) {
        this.name = name;
        this.age = age;
        this.race = race;
    }
}
