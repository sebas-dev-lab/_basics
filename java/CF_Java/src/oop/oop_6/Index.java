package oop.oop_6;

public class Index {
    /**
     * HERENCIA
     * 
     * Creamos nuevas clases a partir de clases ya existentes
     * 
     * 
     */
    public static void main(String[] args) {

        Cat cat = new Cat("cat", "ni idea", 4);
        Dog dog = new Dog("dog", "chihuaua", 4);

        cat.sleep();
        dog.sleep();
    }
}
