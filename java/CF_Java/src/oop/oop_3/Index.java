package oop.oop_3;

public class Index {
    public static void main(String[] args) {
        /**
         * SOBRECARGA DE METODOS
         * 
         * Cuando tengo 2 o mas metodos con el mismo nombre en la misma clase Esto para
         * obtener comportamientos distintos
         * 
         * 
         * Ejemplo: Si necesito realizar calculos. Puedo hacerlo con enteros, flotantes
         * doubles, etc.
         * 
         * Java permite repetir nombres de metodos ya que acepta la sobrecarga. Pero no
         * pueden contener el mismo tiepo de datos.
         */

        Calc calculator = new Calc();
        int res = calculator.sum(10, 20);
        float res2 = calculator.sum(10.45f, 20.99f);
        double res3 = calculator.sum(10.3, 20.3);
        int res4 = calculator.sum(10, 20, 8, 939, 030303, 19);

        Calc arrayCa = new Calc();
        int array[] = { 1, 2, 3, 4, 5 };
        arrayCa.arr(array);

        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);

    }
}
