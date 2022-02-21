package Ejercicio1;

import java.util.Scanner;

import static Ejercicio1.Array.*;

public class Main {

    public static void main(String[] args) {
        int []aleatorio = new int[20];
        int []distintos= new int[20];
        int []contrario = new int[20];
        generar(aleatorio);
        cogerPar(aleatorio);
        llenar(distintos);
        primo(distintos);
        reves(contrario);

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige un numero del 100-300");
        int elegir = sc.nextInt();

        System.out.println(encontrar(distintos, elegir));



    }
}
