
package com.darksempaii.fprogramacion;


public class OperadoresAsignacion {


    public static void main(String[] args) {
        int a = 20, b = 10, c, d, e = 10, f = 4, g = 9;
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
