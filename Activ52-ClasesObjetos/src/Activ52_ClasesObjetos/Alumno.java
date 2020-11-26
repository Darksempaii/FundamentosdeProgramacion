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

}
