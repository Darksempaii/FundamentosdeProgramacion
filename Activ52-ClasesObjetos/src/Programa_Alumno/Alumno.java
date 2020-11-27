package Programa_Alumno;

public class Alumno {

    //declaracion de variables
    private String nombre;
    private String apellido;
    private int[] calif = new int[6];

    public Alumno(String nom, String ape, int[] cal) { //constructor
        this.nombre = nom;
        this.apellido = ape;
        this.calif = cal;
    }

    public String toString() { //metodo que regresa las variables
        String cadena = "";
        for (int i = 0; i < calif.length; i++) {
            cadena = cadena + calif[i] + "";
        }
        return "\nNombre: " + nombre + "\nApellido: " + apellido + "\nCalificaciones: " + cadena;
    }

    public int calcularMinimo() { //calcula la calificacion minima
        int minCalif = calif[0];
        for (int i = 0; i < calif.length; i++) {
            if (minCalif > calif[i]) {
                minCalif = calif[i];
            }
        }
        return minCalif;
    }

    public int calcularMaximo() { //calcula la calificacion maxima
        int maxCalif = calif[0];
        for (int i = 0; i < calif.length; i++) {
            if (maxCalif > calif[i]) {
                maxCalif = calif[i];
            }
        }
        return maxCalif;
    }

    public String tipoAlumno() { //calcula el tipo de alumno
        String tipo = "";
        float rcalif = 0;
        //calculo del la calificacion total
        for (int i = 0; i < calif.length; i++) {
            rcalif = rcalif + calif[i];
        }
        rcalif = rcalif / calif.length;
        //respuestas
        if (rcalif >= 0 && rcalif <= 6.9) {
            tipo = "Deficiente";
        } else if (rcalif >= 7 && rcalif <= 7.9) {
            tipo = "Regular";
        } else if (rcalif >= 8 && rcalif <= 8.9) {
            tipo = "Bueno";
        } else if (rcalif >= 9 && rcalif <= 10) {
            tipo = "Sobresaliente";
        }
        return nombre + " es: " + tipo;
    }

}
