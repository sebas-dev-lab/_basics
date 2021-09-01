package oop.oop_5;

public class User {

    public String username;

    // Constructor
    public User(String username) {
        this.username = username;
    }

    public void role() {
        Admin admin = new Admin();
        admin.work();
    }

    // Clase Admin
    // Puede contener cualquier modificador de acceso
    // Puede tener acceso a datos de la clase padre
    public class Admin {
        // Esta clase luego puede ser utilizada en la clase principal
        public void work() {
            System.out.println("Admin " + username + " is working");
        }
    }

}
