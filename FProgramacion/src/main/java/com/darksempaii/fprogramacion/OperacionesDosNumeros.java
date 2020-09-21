package com.darksempaii.fprogramacion;
//Clases importadas
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
        System.out.println("suma, resta, multiplicacion, divicion de numeros");
        System.out.print("Dame un numero: ");
        num1 = sc.nextInt();
        System.out.print("Dame otro numero: ");
        num2 = sc.nextInt();
        suma = num1 + num2;
        System.out.println("El resultado de la divicion es: " + suma);
        resta = num1 - num2;
        System.out.println("El resultado de la divicion es: " + resta);
        multiplicacion = num1 * num2;
        System.out.println("El resultado de la divicion es: " + multiplicacion);
        division = num1 / num2;
        System.out.println("El resultado de la divicion es: " + division);
    }

}
