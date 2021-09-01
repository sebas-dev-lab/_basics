class CicleAndConditionals {
    public static void main(String[] args) {
        /**
         * CICLOS Y CONDICIONALES => Bloques de control
         * 
         * Se pueden determinar 3 tipos de instrucciones => seleccion, iteracion y salto
         */

        // Instrucciones de seleccion
        String color = "rojo";
        if (color.equalsIgnoreCase("Verde")) {
            System.out.println("Avanzar");
        } else if (color.equalsIgnoreCase("Amarillo")) {
            System.out.println("Cuidado");
        } else {
            System.out.println("Detenerse");
        }
        // Condiciones anidadas
        int prom = 10;
        if (prom >= 7) {
            if (prom == 10) {
                System.out.println("Muchas felicidades");
            } else {
                System.out.println("Felicidades");
            }
        } else if (prom < 7) {
            System.out.println("Rehacer");

        }
        /**
         * CICLOS Y CONDICIONALES => Bloques de control
         * 
         * SCOPE
         * 
         * El alcance de una variable donde puede ser utilizada Esta variable solo puede
         * ser utilizada dentro del bloque/scope donde fue definida
         * 
         */

        int num = 10;
        if (num > 7) {
            String msj = "Hola";
            if (num == 10) {
                System.out.println(msj);
            }
        }
        // System.out.println(msj); ======> Al intentar usar la variable msj fuera del
        // scope del if vamos a tener un error. La variable msj solo puede ser utilizada
        // dentro del scope del if. EN cambio num puede ser utilizado dentro del scope
        // de main.
        // Cuando el bloque termina su ejecucion todas las variables que se declararon
        // dentro de ese scope s epierden.
        // Una v

        /**
         * CICLOS Y CONDICIONALES => Bloques de control
         * 
         * SWICH
         * 
         * ejecuta diferentes partes del codigo basandose en una expresion el cual no
         * puede ser un booleano
         * 
         */
        String color2String = "Amarillo";
        switch (color2String) {
            case "Verde":
                System.out.println("PASAR");
                break;
            case "Amarillo":
                System.out.println("CUIDADO");
                break;
            case "Rojo":
                System.out.println("DETENERSE");
                break;
            default:
                System.out.println("NO DEFINIDO");

        }
        /**
         * CICLOS Y CONDICIONALES => Bloques de control
         * 
         * CICLO WHILE/DO WHILE
         * 
         */
        int numWhile = 10;
        while (numWhile > 0) {
            System.out.println(numWhile);
            numWhile--;
        }
        numWhile = 10;
        do {
            System.out.println(numWhile);
            numWhile--;
        } while (numWhile > 0);

        /**
         * CICLOS Y CONDICIONALES => Bloques de control
         * 
         * CICLO FOR
         * 
         */

        // Forma Tradicional => for(inicializacion; condicion; iteracion){}

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i <= 10; System.out.println(i), System.out.println(i * 10), i++, System.out.println(i * 1000)) {
            System.out.println("=====================================");
        }

        for (int i = 0; i <= 10;) {
            System.out.println("=====================================");
            System.out.println(i);
            System.out.println(i * 10);
            System.out.println(i * 1000);
            System.out.println("=====================================");
            i++;

        }

        int j = 0;
        for (; j <= 10;) {
            System.out.println("=====================================");
            System.out.println(j);
            System.out.println(j * 10);
            System.out.println(j * 1000);
            System.out.println("=====================================");
            j++;

        }

        for (int i = 0; i <= 10;) {
            if (i == 5) {
                continue;
            }
            if (i == 8) {
                break;
            }
            System.out.println("=====================================");
            System.out.println(i);
            System.out.println(i * 10);
            System.out.println(i * 1000);
            System.out.println("=====================================");
            i++;

        }
        
    }

}
