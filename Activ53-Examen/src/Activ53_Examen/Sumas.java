package Activ53_Examen;

public class Sumas {

    private int a;

    public Sumas(int a) {
        //metodo constructor
        this.a = a;
    }

    public String toString() {
        //retorno de la variable
        return " " + a + " ";
    }

    public int sumaCosecutivosHastaA() {
        //metodo para la suma consecutiva
        int suma = 0;
        for (int i = 0; i <= a; i++) {
            suma = suma + i;
        }
        return suma;
    }

    public int sumaParesHastaA() {
        //metodo para la suma de pares
        int par = 0;
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                par = par + i;
            }
        }
        return par;
    }

}
