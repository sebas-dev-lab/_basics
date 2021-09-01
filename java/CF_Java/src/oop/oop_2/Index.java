package oop.oop_2;

public class Index {
    /**
     * ENCAPSULAMIENTO
     * 
     * Forma de controlar el acceso a los datos e instancias como capa de seguridad
     * 
     * Para ello usamos los modificadores de acceso.
     * 
     * - Default - Public - Private - Protected
     * 
     * Cuando los elementos son privados tenemos dos metodos, setters y getters.
     * 
     * 
     * CONSTRUCTOR
     * 
     * FInalidad de inicializar un objeto durante su creacion. Sintactitamente
     * similar a un metodo. Tiene por nombre al nombre de la clase.
     * 
     * 
     */

    public static void main(String[] args) {

        User user = new User("name", "pass");
        User user1 = new User();
        User user2 = new User("user2");
        // user.password = "pass"; => No es posible ya que es privado.
        // Podemos usar el metodo getter creado o seter

        System.out.println(user.getPassword());

        user.hi();
        user1.hi();
        user2.hi();
    }

}
