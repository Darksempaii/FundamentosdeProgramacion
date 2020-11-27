package Programa_Alcancía;

public class AplicacionAlcancia {

    public static void main(String[] args) {
        //declaracion de Objetos
        Alcancia alcanciaDeJose = new Alcancia("Jose",450);
        Alcancia alcanciaDeMaria = new Alcancia("Maria",380);
        //muestra de ahorros
        System.out.println(alcanciaDeJose);
        System.out.println(alcanciaDeMaria);
        //Vaciado de alcancias
        System.out.println(alcanciaDeJose.romperAlcancia());
        System.out.println(alcanciaDeMaria.romperAlcancia());

        
    }

}
