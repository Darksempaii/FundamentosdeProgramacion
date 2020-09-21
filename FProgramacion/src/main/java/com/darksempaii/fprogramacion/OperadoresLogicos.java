
package com.darksempaii.fprogramacion;


public class OperadoresLogicos {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("1.La operacion ( a * b + 2 == 17 ) da a: " + (a * b + 2 == 17));
        System.out.println("2.la operacion (a > b )&&( 2*a <= b) da a: " + ((a > b) && (2 * a <= b)));
        System.out.println("3.la operacion (b++ > 3) || ((a+b) <= 8) && (a>b) da a: " + ((b++ > 3) || ((a + b) <= 8) && (a > b)));
        System.out.println("4.la operacion (((a++ /2) < b) && (a++/2 > b)) da a: " + ((((a++ / 2) < b) && (a++ / 2 > b))));
        System.out.println("5.la operacion ((a<=(2*b)) &&(a>b) || (a*3 <= b)) da a: " + (((a <= (2 * b)) && (a > b) || (a * 3 <= b))));
    }

}
