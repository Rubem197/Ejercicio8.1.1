package Ejercicio4;

import java.util.Scanner;

public class Erasto {

    public static int[] generarArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hasta que numero quiere saber la criba");
        int numero = sc.nextInt();
        int[] primos = new int[generarTamano(numero)];
        generarValores(primos, numero);
        generarCriba(primos, numero);
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
        for (int i = 3; i < numero; i++) {
            if (i % 2 != 0) {
                A[tamano] = i;
                tamano++;
            }
        }
    }

    public static void generarCriba(int[] A, int numero) {
        int j = 0;
        int contador = 0;
        while (j < A.length) {
            for (int i = 2; i < numero; i++) {
                if (3 * i == A[j] || 5 * i == A[j] || 7 * i == A[j]) {
                    contador++;
                    A[i]=0;
                }
            }
            j++;
        }
        int[] B = new int[A.length - contador];
        int posicion=0;
        for (int x=0;x<A.length;x++){
            if (A[x]!=0){
                B[posicion]=A[x];
                posicion++;
            }
        }
        for (int x:B){
            System.out.println(x);
        }
    }

}
