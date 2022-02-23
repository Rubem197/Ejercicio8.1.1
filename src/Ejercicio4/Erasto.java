package Ejercicio4;

import java.util.Scanner;

public class Erasto {
    /**
     * Metodo que pregunta hasta que numero quieres saber la criba en el array de enteros
     * y llama al metodo de generar array despues de crearlo llama a los metodos
     * generarValores y generarCriba que tienen de entrada el aray y el numero del tamaño del array
     *
     * @return array de enteros
     */
    public static int[] generarArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hasta que numero quiere saber la criba");
        int numero = sc.nextInt();
        int[] primos = new int[generarTamano(numero)];
        generarValores(primos, numero);
        generarCriba(primos, numero);
        return primos;
    }

    /**
     * este metodo crea el array con los impares hasta el numero pedido en el metodo anterior
     *
     * @param numero entero con el numero maximo
     * @return entero del tamaño
     */
    public static int generarTamano(int numero) {
        int longitud = 0;
        for (int i = 0; i < numero; i++) {
            if (i % 2 != 0) {
                longitud++;
            }
        }
        return longitud;
    }

    /**
     * este metodo llena el array con los impares empezando con el numero 3
     *
     * @param A      Array de enteros
     * @param numero entero con el numero maximo
     */
    public static void generarValores(int[] A, int numero) {
        int tamano = 0;
        for (int i = 3; i < numero; i++) {
            if (i % 2 != 0) {
                A[tamano] = i;
                tamano++;
            }
        }
    }

    /**
     * Este metodo coge los primos con la formula criba y usa los numeros 3, 5 y 7.
     * tiene un while y dentro un for para comprobar si los numeros 3 5 y 7 multiplicados por todos los numeros
     * hasta el maximo del array es igual al array a de la posicion j.
     * si se da el caso aumenta un contador y el array posicion de i vale 0 por que serian los numeros que no son primos
     * luego añade a el array b tendra el tamaño de a menos contador.
     * y si a no vale 0 b cogera el valor de a y ya tedra la criba.
     *
     * @param A      Array de enteros
     * @param numero entero con el numero maximo
     */
    public static void generarCriba(int[] A, int numero) {
        int j = 0;
        int contador = 0;
        while (j < A.length) {
            for (int i = 2; i < numero; i++) {
                if (3 * i == A[j] || 5 * i == A[j] || 7 * i == A[j]) {
                    contador++;
                    A[i] = 0;
                }
            }
            j++;
        }
        int[] B = new int[A.length - contador];
        int posicion = 0;
        for (int x = 0; x < A.length; x++) {
            if (A[x] != 0) {
                B[posicion] = A[x];
                posicion++;
            }
        }
        for (int x : B) {
            System.out.println(x);
        }
    }

}
