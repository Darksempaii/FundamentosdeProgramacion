package com.darksempaii.activ31ifelse;

import javax.swing.*;

public class TipoTriangulo {

    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las medidas del lado A"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las medidas del lado B"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las medidas del lado C"));
        if (num1 == num2 && num2 == num3) {
            JOptionPane.showMessageDialog(null, "Es un triangulo Equilatero");
        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
            JOptionPane.showMessageDialog(null, "Es un triangulo Isoceles");
        } else if(num1!=num2 || num1!=num3 || num3!=num2){
            JOptionPane.showMessageDialog(null, "Es un triangulo Escaleno");
        }

    }

}
