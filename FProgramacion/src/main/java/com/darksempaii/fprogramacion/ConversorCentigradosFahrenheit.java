
package com.darksempaii.fprogramacion;

import java.util.Scanner;


public class ConversorCentigradosFahrenheit {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centígrados: ");
        double c = sc.nextDouble();
        double f = 9 / 5.0 * c + 32;
        System.out.println(c + " grados Celsius equivalen a " + f + " grados Fahrenheit");
    }
}
