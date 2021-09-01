package oop.oop_2;

public class User {
    public String username;
    private String password;

    // CONSTRUCTOR

    // SOBRECARGA DE CONSTRUCTORES => Argumentos diferentes
    public User(String username, String password) {
        // Puede contener encapsulamiento//mismo nombre que class
        System.out.println("Objeto creado");
        this.username = username;
        this.password = password;
        
    }

    public User() {
        this.password = "";
        this.username = "";
    }

    public User(String username) {
        this.username = username;
    }


    public void hi() {
        System.out.println("Hola, mi nombre es " + this.username);
    }

    // Getter
    public String getPassword() {
        return this.password;
    }

    // Setter
    public void setPassword(String pass) {
        this.password = pass;
    }

}
