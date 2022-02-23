package Ejercicio3;

import java.util.Scanner;

public class Pasajeros {

    /**
     * Metodo que pregunta si el pasajero es fumador o no, segun la opcion llamara al metodo noFumador o fumador
     * va preguntando a los pasajeros hasta se introduzca 0
     *
     * @param A Array de enteros
     */
    public static void asignar(int[] A) {
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("presiona 1 zona de no fumadores o 2  zona de fumadores y 0 para salir");
            opc = sc.nextInt();

            if (opc == 1) {
                noFumador(A);
            }
            if (opc == 2) {
                fumador(A);
            }

        } while (opc != 0);
    }

    /**
     * Metodo llamado del metodo asignar y que mira los asientos disponibles, que hasta que no se asigne un asiento
     * o todos los asientos esten llenos no se saldra, una vez dentro mira si el asiento no esta asignado 0
     * y si i es menor a 16 que son los asientos disponibles para los no fumadores pues se asigna un asiento,
     * si el asiento esta ocupado pues se va a la siguiente posicion y si has superado el asiento 16 se sale del bucle
     * y te avisa de que no hay mas asientos si quieres ir a fumadores
     *
     * @param A Array de enteros
     */
    public static void noFumador(int[] A) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int contador = 0;
        int limite = 0;
        while (contador == 0) {
            if (A[i] == 0 && i < 16) {
                A[i] = 1;
                System.out.println("tienes asignado el asiento " + (i + 1));
                i++;
                contador++;
            } else if (A[i] != 0 && i < 16) {
                i++;
            } else {
                contador++;
                limite++;
            }
            if (limite > 0) {
                System.out.println("No hay asientos quieres ir a la zona de fumadores si o no");
                String respuesta = sc.next();
                if (respuesta.equals("si")) {
                    fumador(A);
                }
            }
        }

    }

    /**
     * Metodo llamado del metodo asignar y que mira los asientos disponibles, que hasta que no se asigne un asiento
     * o todos los asientos esten llenos no se saldra, una vez dentro mira si el asiento no esta asignado 0
     * y si i es menor a 20 que son los asientos disponibles para los  fumadores pues se asigna un asiento,
     * si el asiento esta ocupado pues se va a la siguiente posicion y si has superado el asiento 20 se sale del bucle
     * y te avisa de que no hay mas asientos si quieres ir a no fumadores
     *
     * @param A Array de enteros
     */
    public static void fumador(int[] A) {
        Scanner sc = new Scanner(System.in);
        int j = 16;
        int contador = 0;
        int limite = 0;
        while (contador == 0) {
            if (A[j] == 0 && j <= 19) {
                A[j] = 1;
                System.out.println("tienes asignado el asiento " + (j + 1));

                contador++;
            } else if (A[j] != 0 && j < 19) {
                j++;

            } else {
                contador++;
                if (j == 19) {
                    limite++;
                }
            }
            if (limite > 0) {
                System.out.println("No hay asientos quieres ir a la zona de no fumadores si o no");
                String respuesta = sc.next();
                if (respuesta.equals("si")) {
                    noFumador(A);
                }
            }
        }

    }

}




