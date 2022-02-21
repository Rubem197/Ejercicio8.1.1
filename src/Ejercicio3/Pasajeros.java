package Ejercicio3;

import java.util.Scanner;

public class Pasajeros {


    public static void asignar(int[] A) {
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("presiona 1 zona de no fumadores o 2  zona de fumadores y 0 para salir");
            opc = sc.nextInt();

            if (opc == 1) {
                int i = 0;
                int contador = 0;
                if (i < 16) {
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
                        }
                    }
                }
                if (i == 16) {
                    System.out.println("No hay asientos en este avion el proximo vuelo es dentro de 5 horas");
                }
            }
            if (opc == 2) {
                int j = 16;
                int contador = 0;
                if (j < 20) {
                    while (contador == 0) {
                        if (A[j] == 0 && j <= 19) {
                            A[j] = 1;
                            System.out.println("tienes asignado el asiento " + (j+1));

                            contador++;
                        } else if (A[j] != 0 && j < 19) {
                            j++;
                        } else {
                            contador++;
                        }
                    }
                }
                if (j == 19) {
                    System.out.println("No hay asientos quieres ir a la zona de no fumadores si o no");
                    String respuesta = sc.next();
                    if (respuesta.equals("si")) {
                        int i = 0;
                        contador = 0;
                        if (i < 16) {
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
                                }
                            }
                            if (i == 16) {
                                System.out.println("tampoco hay asientos en la zona de no fumadores pronto sale otro vuelo");
                            }
                        }
                    }
                }

            }
        } while (opc != 0);
    }


}
