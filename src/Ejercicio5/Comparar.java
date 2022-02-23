package Ejercicio5;

import java.util.Scanner;

public class Comparar {
    /**
     * genera 4 numeros aleatorios entre 1 y 9 y los guarda en un array.
     *
     * @param A array de 4 posiciones
     * @return array de enteros aleatorios
     */
    public static int[] generar(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.round(Math.random() * 8 + 1);
        }
        return A;
    }

    /**
     * convierte el array generado anteriormente en un String para asi poder compararlo mas adelante.
     *
     * @param A array de enteros aleatorios
     * @return String con una cadena de 4 enteros positivos
     */
    public static String convertir(int[] A) {
        String cpu = "";
        for (int i = 0; i < A.length; i++) {
            cpu += String.valueOf(A[i]);
        }
        return cpu;
    }

    /**
     * Metodo que contiene un bucle de 12 repeticiones que pide al usuario una cadena de 4 numeros del 1 al 9
     * Llama al metodo comparar que es el juego y si devuelve true acaba el juego y muestra mensaje.
     *
     * @param A array de enteros aleatorios
     */
    public static void bluce(int[] A) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n < 12) {
            System.out.println("introduce 4 caracteres del 1 al 9");
            String cadena = sc.next();
            n++;
            if (comparar(A, cadena) == true) {
                n = 12;
                System.out.println("Felicidades has ganado");
            }
        }
    }

    /**
     * Metodo con dos bucles anidados que comprueba si estan en la misma posicion y si es asi muesta 1 y si esta
     * pero esta en otra posicion muestra un 0 y si no se encuentra devuelve - para saber que no esta acertado,
     * si se acierta los 4 numeros al tener un contador que se suma por cada uno que se acierta si contador vale 4
     * pues devuelte true y si no devuelve false, al devolver true finaliza el programa
     *
     * @param A array de enteros aleatorios
     * @param B Cadena de 4 numeros metidos por usuario
     * @return
     */
    public static boolean comparar(int[] A, String B) {
        int adivinado = 0;
        for (int i = 0; i < A.length; i++) {
            int contador = 0;
            for (int j = 0; j < 4; j++) {
                if (convertir(A).charAt(j) == B.charAt(i)) {
                    if (convertir(A).charAt(i) == B.charAt(i)) {
                        System.out.print(1);
                        j = 4;
                        adivinado++;
                    } else {
                        System.out.print(0);
                        j = 4;
                    }
                } else {
                    contador++;
                    if (contador == 4) {
                        System.out.print("-");
                    }
                }
            }
            if (adivinado == 4) {
                System.out.println();
                return true;
            }
        }
        System.out.println();
        return false;
    }

}
