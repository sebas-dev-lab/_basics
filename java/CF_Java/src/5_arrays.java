class ArraysCF {
    public static void main(String[] args) {
        /**
         * ARRAYS
         * 
         * Estructura de datos que permite almacenar datos del mismo tipo y la longitud
         * es inmutable una vez definimos el mismo.
         * 
         */

        String nombres[];
        nombres = new String[3];
        nombres[0] = "str1";
        nombres[1] = "str2";
        nombres[2] = "str3";

        // System.out.println(nombres[0]);
        // System.out.println(nombres[1]);
        // System.out.println(nombres[2]);

        String strs[] = new String[3];
        String[] strs2 = new String[3];// lo mismo
        String str3[] = { "str1", "str2", "str3" };

        // Recorrer arreglos
        int calificaciones[] = { 9, 8, 7, 10, 9, 8, 8, 9 };
        int ln = calificaciones.length;
        int sum = 0;
        for (int i = 0; i < ln; i++) {
            sum += calificaciones[i];
        }
        int prom = sum / ln;
        // System.out.println(prom);

        // Ver metodos indexOf string.indexOf('M'); string.indexOf("m", index +1);
        // Ver metodo substring=> str.substring(index)

        // For each

        for (int i : calificaciones) {
            // System.out.println(i);
        }

        // Modificar valores
        int val[] = new int[10];
        for (int i = 0; i < val.length; i++) {
            val[i] = i;
        }

        // Arrays bidimencionales => Arreglo de arreglo => matriz

        int matriz[][] = new int[4][3];// Primera casilla 0,0 (x,y) segunda casilla 0,1 ...
        // x=0; y=0
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 1;
        matriz[1][1] = 2;
        matriz[1][2] = 3;
        matriz[2][0] = 1;
        matriz[2][1] = 2;
        matriz[2][2] = 3;
        matriz[3][0] = 1;
        matriz[3][1] = 2;
        matriz[3][2] = 3;

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println(matriz[x][y]);

            }
        }

        for (int fila[] : matriz) {
            for (int celda : fila) {
                System.out.println(celda);

            }
        }

        // Establecer arrays bidimencionales sin establecer la longitud de las filas
        int cal[][]=new int[5][]; //Si no conocemos la cantidad de columnas especificamos solo las filas. en este caso deja de ser matriz
    }

}
