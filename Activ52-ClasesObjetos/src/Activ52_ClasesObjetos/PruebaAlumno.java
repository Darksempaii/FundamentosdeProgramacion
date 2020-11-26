
package Activ52_ClasesObjetos;


public class PruebaAlumno {

    public static void main(String[] args) {
        int[] calificaciones = {7,8,9,9,7,9};
        int[] calificaciones2 = {8,8,7,7,8,10};
        Alumno jose = new Alumno("jose","aguirre",calificaciones);
        Alumno josefina = new Alumno("josefina","Gutierres",calificaciones2);
        System.out.println(jose);
        System.out.println("Calif min: "+jose.calcularMinimo());
        System.out.println("Calif max: "+jose.calcularMaximo());
        System.out.println(josefina);
        System.out.println("Calif min: "+josefina.calcularMaximo());
        System.out.println("Calif max: "+josefina.calcularMinimo());
    }
    
}
