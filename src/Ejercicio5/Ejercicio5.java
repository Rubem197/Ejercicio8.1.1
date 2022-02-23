package Ejercicio5;

import static Ejercicio5.Comparar.*;

public class Ejercicio5 {
    /**
     * Creacion de un array de 4 posiciones, llamada al metodo generar que tiene como entrada el array
     * y tambien tiene un bucle de juego para mostrar el numero generado para asi probar el programa sabiendo el
     * numero generado aleatoriamente, luego llamada al metodo bucle del juego
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] juego = new int[4];
        generar(juego);
        for (int x : juego) {
            System.out.print(x);
        }
        System.out.println();
        bluce(juego);
    }
}
