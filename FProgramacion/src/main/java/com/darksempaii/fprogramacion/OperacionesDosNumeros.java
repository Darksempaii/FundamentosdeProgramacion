
package com.darksempaii.fprogramacion;
import java.util.Scanner;

public class OperacionesDosNumeros {


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        String mensaje;
        System.out.print("Cual es el mensaje: ");
        mensaje=sc.nextLine();
        System.out.println("El mensaje de hoy es ** "+mensaje+" **");
    int num1;
        System.out.println("Dame un numero: " );
        num1=sc.nextInt();
        System.out.println("El numero que me diste es: "+ num1);
    }
    
}
