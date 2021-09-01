class Operators {
    public static void main(String[] args) {
        /**
         * OPERADORES ARITMETICOS
         * 
         */
        // variables
        int varX = 50, varY = 10;
        int resultado;

        // Operadores basicos
        resultado = varX + varY;
        System.out.println(resultado);

        resultado = varX - varY;
        System.out.println(resultado);

        resultado = varX * varY;
        System.out.println(resultado);

        resultado = varX / varY;
        System.out.println(resultado);

        // Incrementar en 1 ++/--
        varX = varX + 1; // or
        varX++;
        varX--;
        // Incrementar en n...
        varX += 100;
        varX -= 50;
        // Multiplicar/dividir variable por n...
        varX *= 10;
        varX /= 5;

        System.out.println(varX);

        /**
         * CASTING
         * 
         * No se puede convertir un numero flotante a un entero. Hacemos casting =>
         * transformarmos en un tipo de dato concreto
         */
        int varZ = 50, varJ = 10;
        float varW = 5.5f;
        int result;

        // Error porque la suma es float y la variable es entera
        // result = varZ + varW; <=====
        // Hacemos casting anteponiendo entre parentesis el tipo de dato a transformar
        result = varZ + (int) varW; // =>Numero float -> int. => Redondea el valor float
        result = varZ + (int) varW;
        System.out.println(result);

        /**
         * OPERADORES RELACIONALES
         * 
         * Obtenemos un booleano < > >= <= == !=
         * 
         */
        boolean relacionales;
        relacionales = varZ > varJ;
        System.out.println(relacionales);
        relacionales = varZ < varJ;
        System.out.println(relacionales);
        relacionales = varZ >= varJ;
        System.out.println(relacionales);
        relacionales = varZ <= varJ;
        System.out.println(relacionales);
        relacionales = varZ == varJ;
        System.out.println(relacionales);
        relacionales = varZ != varJ;
        System.out.println(relacionales);
        /**
         * OPERADORES LOGICOS
         *
         * and (&&) or(||) not(!) => valor booleano
         * 
         */
        boolean logicos;
        logicos = 5 >= 5 && true;
        System.out.println(logicos);
        /**
         * OPERADORES TERNARIOS
         * 
         * IFTTT (?)
         * 
         * expresio1 ? expresion2 : expresion3
         */
        String msj = 10 > 9 ? "Es mayor" : "Es menor";
        System.out.println(msj);
        
    }
}
