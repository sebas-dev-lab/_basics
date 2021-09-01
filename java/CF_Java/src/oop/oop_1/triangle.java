package oop.oop_1;

public class triangle {
    float weigth;
    float hight;

    float a(float w, float h) {
        /*
         * Como se retorna un valor se coloca el tipo de valor a retornar. Se cambia
         * void por el tipo de dato. EN este caso se retorna un valor float.
         */
        this.hight = h;
        this.weigth = w;

        return (this.weigth * this.hight) / 2;

    }
}
