package Ejercicio2;

public class Alumnos {

    private String nombres;
    private int notas;

    public Alumnos(String nombres) {
        this.nombres = nombres;
        this.notas = (int) Math.round(Math.random() * 9 + 1);
    }

    public static int notaMedia(Alumnos[] A) {
        int calificaciones = 0;
        int contador = 0;
        for (int i = 0; i < A.length; i++) {
            calificaciones = calificaciones + A[i].getNotas();
            contador++;
        }
        int notamedia = calificaciones / contador;
        System.out.println(notamedia);
        return notamedia;
    }

    public static int notaAlta(Alumnos[] A) {
        int maximaNota = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i].getNotas() > maximaNota) {
                maximaNota = A[i].getNotas();
            }
        }
        System.out.println(maximaNota);
        return maximaNota;
    }

    public static int notaBaja(Alumnos[] A) {
        int notaMinima = 10;
        for (int i = 0; i < A.length; i++) {
            if (A[i].getNotas() < notaMinima) {
                notaMinima = A[i].getNotas();
            }
        }
        System.out.println(notaMinima);
        return notaMinima;
    }

    public static void encimaMedia(Alumnos[] A) {
        int contador = 0;
        for (int i = 0; i < A.length; i++) {

            if (A[i].getNotas() > notaMedia(A)) {
                contador++;

                System.out.println("El alumno " + A[i].getNombres() + " con nota " + A[i].getNotas());
            }
        }
        System.out.println(contador + "Alumnos han sacado por encima de la media");
    }

    public static void debajoMedia(Alumnos[] A) {
        int contador = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i].getNotas() < notaMedia(A)) {
                contador++;
                System.out.println("El alumno " + A[i].getNombres() + " con nota " + A[i].getNotas());
            }
        }
        System.out.println(contador + " alumnos han sacado por debajo de la media");
    }


    public int getNotas() {
        return notas;
    }

    public String getNombres() {
        return nombres;
    }
}
