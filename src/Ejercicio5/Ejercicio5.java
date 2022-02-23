package Ejercicio5;

import static Ejercicio5.Comparar.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        int [] juego = new int[4];
        generar(juego);
        for (int x : juego){
            System.out.print(x);
        }
        System.out.println();
        bluce(juego);
    }
}
