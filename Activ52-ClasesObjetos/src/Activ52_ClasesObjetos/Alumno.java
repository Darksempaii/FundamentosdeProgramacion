package Activ52_ClasesObjetos;

public class Alumno {

    private String nombre;
    private String apellido;
    private int[] calif = new int[6];

    public Alumno(String nom, String ape, int[] cal) {
        this.nombre = nom;
        this.apellido = ape;
        this.calif = cal;
    }

    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < 10; i++) {
            cadena = cadena + calif[i] + "";
        }
        return "\nNombre: " + nombre + "\nApellido: " + apellido + "\nCalificaciones: " + cadena;
    }

    public int calcularMinimo() {
        int minCalif = calif[0];
        for (int i = 0; i < calif.length; i++) {
            if (minCalif > calif[i]) {
                minCalif = calif[i];
            }
        }
            return minCalif;
        }

    

    public int calcularMaximo() {
        int maxCalif = calif[0];
        for (int i = 0; i < calif.length; i++) {
            if (maxCalif > calif[i]) {
                maxCalif = calif[i];
            }
        }
        return maxCalif;
    }

    public String tipoAlumno() {
        String tipo = "";

        return tipo;
    }

}
