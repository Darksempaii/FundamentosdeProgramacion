package com.darksempaii.fprogramacion;
//Clases importadas
import java.text.*;
import java.util.*;

public class OperacionesDosNumeros {

    public static void main(String[] args) {
        //Declaracion del Scanner y variables principales
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        double num1;
        double num2;
        //Entrada scanner
        System.out.println("suma, resta, multiplicacion, divicion de numeros");
        System.out.print("Dame un numero: ");
        num1 = sc.nextInt();
        System.out.print("Dame otro numero: ");
        num2 = sc.nextInt();
        //Operaciones Aritmeticas y Salida a Consola
        double suma = num1 + num2;
        System.out.println("El resultado de la divicion es: " + df.format(suma));
        double resta = num1 - num2;
        System.out.println("El resultado de la divicion es: " + df.format(resta));
        double multiplicacion = num1 * num2;
        System.out.println("El resultado de la divicion es: " + df.format(multiplicacion));
        double division = num1 / num2;
        System.out.println("El resultado de la divicion es: " + df.format(division));
    }

}
