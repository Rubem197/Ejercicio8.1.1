package Ejercicio1;

public class Array {


    public static int[] generar(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.round(Math.random() * 200 + 100);
        }
        return A;
    }

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

    public static int[] reves(int[] A) {
        int[] B = new int[20];
        int recorrer = 0;
        for (int i = generar(A).length - 1; i >= 0; i--) {
            B[recorrer] = A[i];
            recorrer++;
        }
        return B;
    }

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
