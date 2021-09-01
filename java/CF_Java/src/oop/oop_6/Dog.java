package oop.oop_6;

public class Dog extends Mascot {
    // Heredamos clase
    // Constructor
    public Dog(String name, String race, int age) {
        super(name, race, age);
    }

    // Sobre escritura de metodos => Polimorfismo
    // Cuando un metodo padre no subsana lo que necesita la clase hijo entonces este
    // puede sobre escribir para que el metodo funcione como lo necesite.
    // Primero busca en la calse de instancia si no lo encuentra lo buscara en el
    // padre
    /*
     * super => nos permite polimorfismo y mantener a la vez funcionalidad del
     * padre. Hace referencia al padre.
     */
    @Override // => Buenas practicas de sobre escritura.
    public void sleep() {
        super.sleep();
        System.out.println("The dog is sleeping");
    }
}
