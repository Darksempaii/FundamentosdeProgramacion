package com.darksempaii.fprogramacion;
//Clases importadas
import java.util.Scanner;

public class OperacionesDosNumeros {

    public static void main(String[] args) {
        //Declaracion del Scanner y variables principales
        Scanner sc = new Scanner(System.in);
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
        System.out.println("El resultado de la divicion es: " + suma);
        double resta = num1 - num2;
        System.out.println("El resultado de la divicion es: " + resta);
        double multiplicacion = num1 * num2;
        System.out.println("El resultado de la divicion es: " + multiplicacion);
        double division = num1 / num2;
        System.out.println("El resultado de la divicion es: " + division);
    }

}
