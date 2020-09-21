package com.darksempaii.fprogramacion;

import java.util.Scanner;

public class OperacionesDosNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int suma;
        int resta;
        int division;
        int multiplicacion;
        String resultado;
        System.out.println("suma, resta, multiplicacion, divicion de numeros");
        System.out.println("Dame un numero: ");
        num1 = sc.nextInt();
        System.out.println("Dame otro numero: ");
        num2 = sc.nextInt();
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        System.out.println("Introdusca la operacion a realizar(suma, resta, multiplicacion, division): ");
        resultado = sc.nextLine();
        System.out.println("El resultado de la divicion es: " + division);
    }

}
