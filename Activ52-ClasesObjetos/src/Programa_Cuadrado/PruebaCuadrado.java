package Programa_Cuadrado;

public class PruebaCuadrado {

    public static void main(String[] args) {
        int c1 = 5,c2 = 7;
        //1º cuadro
        Cuadrado C1 = new Cuadrado(c1);
        System.out.println(C1);
        System.out.println("El area es de: " + C1.calcularArea());
        System.out.println("El perimetro es de: "+C1.calculaPerimetro()+"\n");
        //2º cuadro
        Cuadrado C2 = new Cuadrado(c2);
        System.out.println(C2);
        System.out.println("El area es de: " + C2.calcularArea());
        System.out.println("El perimetro es de: "+C2.calculaPerimetro());
        
    }

}
