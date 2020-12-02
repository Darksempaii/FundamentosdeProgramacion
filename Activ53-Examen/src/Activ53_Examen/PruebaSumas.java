package Activ53_Examen;

public class PruebaSumas {

    public static void main(String[] args) {
        //Creacion de objetos
        Sumas suma1 = new Sumas(10);
        Sumas suma2 = new Sumas(12);
        //Suma 1
        System.out.println("El valor de la primera suma es" + suma1);
        System.out.println("Total de la suma es de " + suma1.sumaCosecutivosHastaA());
        System.out.println("Sumando solo pares es: " + suma1.sumaParesHastaA());
        System.out.println("");
        //Suma 2
        System.out.println("El valor de la primera suma es" + suma2);
        System.out.println("Total de la suma es de " + suma2.sumaCosecutivosHastaA());
        System.out.println("Sumando solo pares es: " + suma2.sumaParesHastaA());
    }

}
