package Ejercicio4;

import java.util.Scanner;

public class Erasto {

    public static int[] generarArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hasta que numero quiere saber la criba");
        int numero = sc.nextInt();
        int[] primos = new int[generarTamano(numero)];
        generarValores(primos, numero);
        return primos;
    }

    public static int generarTamano(int numero) {
        int longitud = 0;
        for (int i = 0; i < numero; i++) {
            if (i % 2 != 0) {
                longitud++;
            }
        }
        return longitud;
    }

    public static void generarValores(int[] A, int numero) {
        int tamano = 0;
        for (int i = 0; i < numero; i++) {
            if (i % 2 != 0) {
                A[tamano] = i;
                tamano++;
            }
        }
    }


}
