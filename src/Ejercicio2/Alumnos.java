package Ejercicio2;


public class Alumnos {
    /**
     * creacion de cadena nombre y entero notas.
     */
    private String nombres;
    private int notas;

    /**
     * Asignar al objeto Alumnos la cadena nombre y el entero notas que es un numero aleatorio entre 1 y 9.
     *
     * @param nombres
     */
    public Alumnos(String nombres) {
        this.nombres = nombres;
        this.notas = (int) Math.round(Math.random() * 9 + 1);
    }

    /**
     * Metodo que obtiene la nota media de los alumnos cogiendo las calificaciones de todos los alumnos
     * y guardandolo en un entero de calificaiones y crear un contador que se aumenta por cada entrada al for.
     * Tras coger todos los alumnos se divide calificaciones entre contador y se guarda en la variable
     * notamedia.
     *
     * @param A Array de objeto Alumno
     * @return entero nota media de los alumnos
     */
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

    /**
     * metodo con repeticion de tamaño del array que comprueba si nota de posicion i es mayor que maxima nota que
     * por defecto viene creada a 0 y si se da la condicion maxima nota vale la posicion del array i.
     *
     * @param A Array de objeto Alumno
     * @return nota mas alta de los alumnos
     */
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

    /**
     * metodo con repeticion de tamaño del array que comprueba si nota de posicion i es menor que nota minima que
     * por defecto viene creada a 0 y si se da la condicion nota maxima vale la posicion del array i.
     *
     * @param A Array de objeto Alumno
     * @return nota mas baja de los alumnos
     */
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

    /**
     * metodo que obtiene la media del metodo de notamedia y si las notas de los alumnos es superios a la notamedia
     * se muestra por pantalla.
     *
     * @param A Array de objeto Alumno
     */
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

    /**
     * metodo que obtiene la media del metodo de notamedia y si las notas de los alumnos es inferior a la notamedia
     * se muestra por pantalla.
     *
     * @param A Array de objeto Alumno
     */
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
