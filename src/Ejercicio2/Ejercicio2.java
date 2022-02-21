package Ejercicio2;

import java.util.Scanner;

import static Ejercicio2.Alumnos.*;
import static Ejercicio2.Alumnos.notaMedia;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumnos a1 = new Alumnos("David");
        Alumnos a2 = new Alumnos("Angel");
        Alumnos a3 = new Alumnos("Alex");
        Alumnos a4 = new Alumnos("Ruben");

        Alumnos[] alumnos = new Alumnos[]{a1, a2, a3, a4};



        int opc;
        do {
            System.out.println("introduce una opcion del menu, para salir pulsa 0");
            opc = sc.nextInt();
            switch (opc) {
                case 1 -> notaMedia(alumnos);
                case 2 -> notaAlta(alumnos);
                case 3 -> notaBaja(alumnos);
                case 4 -> encimaMedia(alumnos);
                case 5 -> debajoMedia(alumnos);
                default -> System.out.println("Has pulsado un numero invalido introduce otro");
            }
        }while(opc !=0);
    }
}
