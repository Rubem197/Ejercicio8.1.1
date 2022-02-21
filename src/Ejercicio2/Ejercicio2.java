package Ejercicio2;

import static Ejercicio2.Alumnos.*;
import static Ejercicio2.Alumnos.notaMedia;

public class Ejercicio2 {

    public static void main(String[] args) {
        Alumnos a1= new Alumnos("David");
        Alumnos a2= new Alumnos("Angel");
        Alumnos a3= new Alumnos("Alex");
        Alumnos a4= new Alumnos("Ruben");

        Alumnos []alumnos = new Alumnos[]{a1,a2,a3,a4};

        encimaMedia(alumnos);
    }
}
