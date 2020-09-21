package com.darksempaii.fprogramacion;

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        double area;
        double base;
        double altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la Base: ");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura");
        altura = sc.nextDouble();
        area = (base * altura) / 2;
        System.out.println("El area del Triangulo es: " + area);
    }

}
