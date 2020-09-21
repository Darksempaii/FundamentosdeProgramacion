
package com.darksempaii.fprogramacion25;


public class OperadoresAsignacion {


    public static void main(String[] args) {
        //Declaracion de variables y sus valores
        int a = 20, b = 10, e = 10, f = 4;
        //Salida a consola y sus Asignaciones
        a = (a + 1);
        b = (b - 1);
        e = (e * 2);
        f = (f / 2);
        System.out.println("1: "+"a,b,e,f "+a+" "+b+" "+e+" "+f);
        a = a - 1;
        b = b + 1;
        e = e / 2;
        f = f * 2;
        System.out.println("2: "+"a.b.e.f "+a+" "+b+" "+e+" "+f);
        a += 1;
        b -= 1;
        e *= 2;
        f /= 2;
        System.out.println("3: "+"a.b.e.f "+a+" "+b+" "+e+" "+f);
    }

}
