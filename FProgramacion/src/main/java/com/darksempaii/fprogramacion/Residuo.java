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
public class Residuo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        float n1, n2;
        float c, r;
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte el dato: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese otro dato: ");
        n2 = sc.nextInt();
        //Proceso
        c = n1 / n1;
        r = n1 % n2;
        //Salida
        System.out.println("El conciente es: " + c);
        System.out.println("El residuo es: " + r);
    }

}
