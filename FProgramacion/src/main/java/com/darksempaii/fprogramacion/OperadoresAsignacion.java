/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darksempaii.fprogramacion;

/**
 *
 * @author Darksempaii
 */
public class OperadoresAsignacion {

    /**
     * @param args the command line arguments
     */
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
