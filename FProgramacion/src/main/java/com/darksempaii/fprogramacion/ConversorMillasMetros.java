
package com.darksempaii.fprogramacion;

import java.util.Scanner;


public class ConversorMillasMetros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la distancia en millas: ");
        String dato = sc.nextLine();
        double distancia = Double.parseDouble(dato);
        double metros = distancia * 1609;
        System.out.println("La distancia en Metros es: " +metros);
    }

}
