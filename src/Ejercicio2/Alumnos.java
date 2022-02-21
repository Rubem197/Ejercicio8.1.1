package Ejercicio2;

public class Alumnos {

    private String nombres;
    private int notas;

    public Alumnos(String nombres){
        this.nombres=nombres;
        this.notas=(int)Math.round(Math.random()*9+1);
    }

    public static int notaMedia(Alumnos[] A){
        int calificaciones = 0;
        int contador=0;
        for (int i =0; i< A.length;i++){
            calificaciones=calificaciones+A[i].getNotas();
            contador++;
        }
        int notamedia=calificaciones/contador;
        return notamedia;
    }
    public static int notaAlta(Alumnos []A){
        int maximaNota=0;
        for (int i =0; i< A.length;i++){
            if (A[i].getNotas()>maximaNota){
                maximaNota=A[i].getNotas();
            }
        }
        return maximaNota;
    }
    public static int notaBaja(Alumnos []A){
        int notaMinima=10;
        for (int i =0; i< A.length;i++){
            if (A[i].getNotas()<notaMinima){
                notaMinima=A[i].getNotas();
            }
        }
        return notaMinima;
    }
    public static void encimaMedia(Alumnos []A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i].getNotas() > notaMedia(A)) {
                System.out.println("El alumno "+A[i].getNombres() +" con nota " +A[i].getNotas());
            }
        }
    }



    public int getNotas() {
        return notas;
    }

    public String getNombres() {
        return nombres;
    }
}
