package oop.oop_3;

public class Calc {

    public void arr(int[] array) {
        for (int s : array) {
            System.out.println(s);
        }
    }

    // Enteros
    public int sum(int... numbers) { // n cantidad de parametros de tipo int
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    // Flotantes
    public float sum(float... numbers) {
        int sum = 0;
        for (float n : numbers) {
            sum += n;
        }
        return sum;
    }

    // Doubles
    public double sum(double... numbers) {
        int sum = 0;
        for (double n : numbers) {
            sum += n;
        }
        return sum;
    }

}
