
package Programa_Alumno;


public class PruebaAlumno {

    public static void main(String[] args) {
        //declaracion de parametros
        int[] calificaciones = {7,8,9,9,7,9};
        int[] calificaciones2 = {8,8,7,7,8,10};
        Alumno jose = new Alumno("jose","aguirre",calificaciones);
        Alumno josefina = new Alumno("josefina","Gutierres",calificaciones2);
        //salida a consola
        System.out.println(jose);
        System.out.println("Calif min: "+jose.calcularMinimo());
        System.out.println("Calif max: "+jose.calcularMaximo());
        System.out.println(jose.tipoAlumno());
        System.out.println(josefina);
        System.out.println("Calif min: "+josefina.calcularMaximo());
        System.out.println("Calif max: "+josefina.calcularMinimo());
        System.out.println(josefina.tipoAlumno());
    }
    
}
