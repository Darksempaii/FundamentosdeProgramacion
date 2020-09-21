/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darksempaii.fprogramacion;

import java.util.Scanner;

/**
 *
 * @author Darksempaii
 */
public class ConversorMillasMetros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la distancia en millas: ");
        String dato = sc.nextLine();
        double distancia = Double.parseDouble(dato);
        double metros = distancia * 1609;
        System.out.println("La distancia en Metros es: " +metros);
//mi = 1609mw;
    }

}
