class StringsStep {
    public static void main(String[] args) {
        /**
         * STRINGS -No es primitivo sino es una clase. -Se puede usar enie y acento.
         */
        String msj = " Variable de tipo striing ";
        String msja = new String("otra forma de declarar el string");
        // Ambos son objetos y por lo tanto se puden realizar otras acciones ya que
        // contienen metodos
        System.out.println(msj);
        System.out.println(msja);
        /**
         * STRINGS => Metodos de cadena
         */
        // Lingitud de caracteres
        int num = msj.length();
        System.out.println(num);
        // Posee o no substrings retorna un boolean - Java toma en cuneta mayusculas y
        // minusculas
        boolean type = msj.contains("tipo");
        System.out.println(type);
        // COmienza o finaliza con substriung
        boolean start = msj.startsWith("Variable");
        boolean end = msj.endsWith("str");
        System.out.println(start);
        System.out.println(end);
        // Concatenar string
        String conc = msj.concat("Javaaaa");
        System.out.println(conc);
        // Concatenar mas de un string
        String ppal = "ppal";
        String s1 = "str1";
        String s2 = "str2";
        String s3 = "str3";
        String strConcat = ppal + s1 + s2 + s3;
        System.out.println(strConcat);

        /**
         * STRINGS => Metodos de formatos
         */
        System.out.println(msj.toUpperCase());
        System.out.println(msj.toLowerCase());
        // Remueve espacios al inicio y final del texto
        System.out.println(msj.trim());
        // Nuevos strings a partir de nuevos tipos de datos
        // %s string %f float %d entero %b boolean
        String msjFormat = String.format("Java %s", "otroString");// %s es reemplazado por otroString
        System.out.println(msjFormat);
        float var = 10.87334422f;
        String msjFormata = String.format("%.2f", var); // Le indico que despues del punto necesito 2 decimales
        String msjFormatb = String.format("El total es: %.2f %s", var, "MX"); // cONCATENAMOS EL STRING INICIAL, CON EL
                                                                              // FORMATO DECIMAL Y AGREGA MX
        String msjFormatC = String.format("El total de  %d articulos es: %.2f %s", num, var, "MX"); // concatenamos
                                                                                                    // valor de tipo
                                                                                                    // entero

        System.out.println(msjFormata);
        System.out.println(msjFormatb);
        System.out.println(msjFormatC);
        // printf => print format
        System.out.printf("El total de  %d articulos es: %.2f %s", num, var, "MX");

        // El reemplazo de los valores es lineal, sin embargo, habrá ocasiones en las
        // cuales nosotros necesitemos especificar el orden, en esos casos seguiremos la
        // siguiente estructura => %, posición, $, tipo

        String uno = "Uno";
        String dos = "Dos";
        String tres = "Tres";

        String resultado = String.format("%3$s - %2$s - %1$s", uno, dos, tres);
        System.out.println(resultado);
        float pi = 3.14159265359f;

        resultado = String.format("%1f - Decimales: %1$.2f", pi, pi);
        System.out.println(resultado);
        /**
         * STRINGS => Comparar caracteres
         */
        String str1 = "Hola";
        String str2 = "hola";
        boolean resStr = str1.equals(str2);
        System.out.printf("%b ", resStr);
        resStr = str1.equalsIgnoreCase(str2);
        System.out.printf("- %b", resStr);

    }
}
