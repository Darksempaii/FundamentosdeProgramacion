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
public class AreaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area=Math.PI;
        double radio;
        System.out.println("ingrese el radio: ");
        radio=sc.nextDouble();
        area=area*radio*radio;
        System.out.println("El area del circulo es: "+area );
                
    }

}
