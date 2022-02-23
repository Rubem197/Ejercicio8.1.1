package Ejercicio1;

public class Array {

    /**
     * Este metodo hace un bucle for de las posiciones de la longitud del arary a y genera numeros
     * aleatorios y los guarda en el array, los numeros son entre 100 y 300
     * y se van guardando en la posicion de i
     *
     * @param A array de enteros
     * @return
     */
    public static int[] generar(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.round(Math.random() * 200 + 100);
        }
        return A;
    }

    /**
     * Este metodo crea un array int de los numeros pares pasado de un array de entrada.
     * Primero mira los pares de el array de entrada para generar el tamaño del array.
     * Una vez creado el array con las posiciones se introduce los numeros pares haciendo otro for
     * e introduciendo los pares del array de entrada
     *
     * @param A array de enteros
     * @return
     */
    public static int[] cogerPar(int[] A) {
        int tamano = 0;
        for (int j : A) {

            if (j % 2 == 0) {
                tamano++;
            }
        }
        int[] B = new int[tamano];
        tamano = 0;
        for (int j : A) {

            if (j % 2 == 0) {
                B[tamano] = j;
                tamano++;
            }

        }
        return B;
    }

    /**
     * Este metodo hace un bucle for de las posiciones de la longitud del arary a y genera numeros
     * aleatorios pero que no se van a repetir, para ello llama a otro metodo que
     * comprueba si el numero que se va a introducir esta en unas de las posiciones del array.
     *
     * @param A array de enteros
     * @return
     */
    public static int[] llenar(int[] A) {
        int random = (int) Math.round(Math.random() * 200 + 100);
        for (int i = 0; i < A.length; i++) {
            if (comprobar(random, A) == true) {
                A[i] = random;
            } else {
                i--;
            }
            random = (int) Math.round(Math.random() * 200 + 100);
        }
        return A;
    }

    /**
     * Este metodo comprueba si un numero aleatorio esta en unas de las posiciones ya escritas del array de enteros
     * usa un for que dentro comprueba si el numero aleatorio es igual a alguna posicion de el array de enteros
     * si encuentra alguno aumenta un contador, si el contador no se ha sumado se devolvera true y se metera el numero
     *
     * @param random numeors aleatorios
     * @param A      array de enteros
     * @return
     */
    public static boolean comprobar(int random, int[] A) {
        int contador = 0;
        for (int i = 0; i < A.length; i++) {
            if (random == A[i]) {
                contador++;
            }
        }
        if (contador == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que crea un array de numeros primos a partir de otro array, para ello primero genera el tamaño del
     * array de primos con un for dentro de otro que comprueba si el resto entre todos los numeros menor
     * al que esta en ese array cada vez que sea igual a 0 aumenta el contador si el contador es menor o igual a 2
     * el tamaño aumentara en 1 y asi con todas las posiciones, una vez generado el tamaño se introducira los primos
     * de la misma manera.
     *
     * @param A array de enteros
     * @return
     */
    public static int[] primo(int[] A) {
        int tamano = 0;
        for (int i = 0; i < A.length; i++) {
            int contador = 0;
            for (int j = 1; j <= A[i]; j++) {
                if (A[i] % j == 0) {
                    contador++;
                }
            }
            if (contador <= 2) {
                tamano++;
            }
        }
        int[] B = new int[tamano];
        tamano = 0;
        for (int i = 0; i < A.length; i++) {
            int contador = 0;
            for (int j = 1; j <= A[i]; j++) {
                if (A[i] % j == 0) {
                    contador++;
                }
            }
            if (contador <= 2) {
                B[tamano] = A[i];
                tamano++;
            }
        }
        return B;
    }

    /**
     * metodo que crea un array a traves de otro pero con los elementos al reves para ello crea un array de
     * la longitud del primer array que empiece en su tamaño hasta que sea 0 y el otro array empieza en 0 y aumenta
     * cada vez que entre al for.
     *
     * @param A array de enteros
     * @return
     */
    public static int[] reves(int[] A) {
        int[] B = new int[20];
        int recorrer = 0;
        for (int i = generar(A).length - 1; i >= 0; i--) {
            B[recorrer] = A[i];
            recorrer++;
        }
        return B;
    }

    /**
     * Este metodo recibe el numero elegido por el usuario y mira si esta en una de las posiciones del array
     * y te devuelve la posicion en la que estaba y si no lo encuentra devuelve -1.
     *
     * @param A      array de enteros
     * @param elegir numero elegido por el usuario entre 100-300
     * @return
     */
    public static int encontrar(int[] A, int elegir) {
        int contador = 0;
        for (int i = 0; i < llenar(A).length; i++) {
            if (elegir == A[i]) {
                return i;
            }
        }
        return -1;
    }

}
