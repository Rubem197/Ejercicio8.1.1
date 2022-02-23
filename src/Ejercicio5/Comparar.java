package Ejercicio5;

import java.util.Scanner;

public class Comparar {

    public static int[] generar(int []A) {
        for (int i = 0; i < A.length; i++) {
            A[i]= (int) Math.round(Math.random() * 8 + 1);
        }
        return A;
    }
    public static String convertir(int[]A){
        String cpu="";
        for (int i=0; i<A.length;i++){
            cpu+=String.valueOf(A[i]);
        }
        return cpu;
    }

    public static void bluce(int []A){
        Scanner sc =new Scanner(System.in);
        int n=0;

        while(n<12){
            System.out.println("introduce 4 caracteres del 1 al 9");
            String cadena=sc.next();
            comparar(A,cadena);
            System.out.println();
            n++;
        }
    }

    public static void comparar(int[]A, String B) {

        for (int i = 0; i < A.length; i++) {
                int contador = 0;
                for (int j = 0; j < 4; j++) {
                    if (convertir(A).charAt(j)==B.charAt(i)){
                        if (convertir(A).charAt(i)==B.charAt(i)) {
                            System.out.print(1);
                            j = 4;


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
            }
        }

}
