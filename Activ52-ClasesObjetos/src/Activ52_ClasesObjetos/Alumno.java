package Activ52_ClasesObjetos;

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

    @Override
    public String toString() { //metodo que regresa las variables
        String cadena = "";
        for (int i = 0; i < 10; i++) {
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

        return tipo;
    }

}
