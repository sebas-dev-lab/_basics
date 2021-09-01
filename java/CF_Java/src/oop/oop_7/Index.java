package oop.oop_7;

public class Index {
    // Clases abstractas
    /*
     * Unicamente colocamos estructuras general y dejamos que las clases hijas
     * definana los detalles. Son identicas a estructura a clase normal. Pero
     * difiere en por lo menos un metodo abstracto. Un metodo abstracto no presenta
     * cuerpo. Define que hacer pero no como hacerlo.
     * 
     * Al tener un metodo abstracto la clase tambien debe ser abstracta
     * 
     * Las clases abstractas pueden ser heredadas por otras clases pero no pueden
     * ser instanciadas.
     * 
     */

    /**
     * PRINCIPIO DE SUSTITUCION
     * 
     */
    public static void main(String[] args) {
        Figure figures[] = new Figure[2];

        Circle c = new Circle(9f);
        Triangle t = new Triangle(10f, 5f);

        // Sustitucion
        Figure c1 = new Circle(9f);
        Figure t1 = new Triangle(10f, 5f);

        figures[0] = c1;
        figures[1] = t1;

        System.out.println(c.a());
        System.out.println(t.a());
        System.out.println(figures[0].a());
        System.out.println(figures[1].a());

    }
}
