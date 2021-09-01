class Enviroment {
    /*
     * Variables: tipoDeDato: - Enteros - Decimales - Caracteres - Booleanos
     * 
     * 8 tipos de datos => tmbien conocidos como tipos primitivos 
     *          byte
     *          short
     *          int
     *          long
     *          char
     *          float
     *          double
     *          boolean
     * Los 8 tipos pueden agruparse en 4 categorias
     *          Enteros => pueden ser pos o neg
     *              -bytes=> 1 byte
     *              -short=> 2 bytes
     *              -int  => 4 bytes
     *              -long => 8 bytes 
     *          Flotantes=> pos o neg
     *              -float
     *              -double
     *          Caracteres
     *              -char => simbolos (letra o numero)
     *          Booleanos
     *              -boolean
     */

    public static void main(String[] args) {
        // Enteros positivos o negativos => int
        int version;
        version = 10;
        System.out.println(version);
        
        // Ejecucion de programa descendente...
        // Nomenclatura camelcase para variables unir con Mayuscula
        int versionJava = 11;
        System.out.println(versionJava);
        /**
         *  Java es fuertemente tipado, lo que indica que una vez declarada una variable con un tipo de dato no podemos guardar en esa variable
         * otro tipo de dato. 
         */
        // Los floats deben finalizar con el sufijo f=> 22.3f
        float versionJavaDecimal=11.2f;
        System.out.println(versionJavaDecimal);

        // '' comillas simples colocamos el simboloe
        char versionJavaChar='a';
        // Obtenemos la misma salida que versionJavaChar ya que 97 hace referencia a la letra "a" en minuscula
        char versionJavaCharNumber=97;

        System.out.println(versionJavaChar);
        System.out.println(versionJavaCharNumber);

        boolean versionJavaBoolean=true;
        boolean versionJavaBooleanFalse=false;
        System.out.println(versionJavaBoolean);
        System.out.println(versionJavaBooleanFalse);

        /**
         *   PALABRAS RESERVADAS 
         * 
                abstract	continue	for	            new	        switch
                assert	    default	    goto	        package	    synchronized
                boolean	    do	        if	            private     this
                break	    double	    implements	    protected	throw
                byte	    else	    import	        public  	thows
                case	    enum	    instanceof	    return	    transient
                catch	    extends	    int         	short	    try
                char	    final	    interface	    static	    void
                class	    finally	    long	        strictfp	volatile
                const	    float	    native	        super	    while
         * 
         */
        /**
         * DECLARACION DE MULTIBPLES VARIABLES
         * 
         */
        
         int var1 = 20, var2 = 21, var3 = 22;
         float pis = 3.1415f, e = 0.1010f;
         System.out.println(var1);
         System.out.println(var2);
         System.out.println(var3);
         System.out.println(pis);
         System.out.println(e);

         /**
          * CONSTANTES => No se modifican con el timepo => Usamos final para indicar que es una constante. Solo la usamos en modo lectura
          */
          final float pi = 3.1415f, e2 = 1.222f;
          System.out.println(pi);
          System.out.println(e2);


        }   

}
