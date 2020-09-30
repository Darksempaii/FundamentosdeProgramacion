package com.darksempaii.activ31ifelse;

import javax.swing.*;

public class TipoTriangulo {

    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese las medidas del lado A","Lado A",JOptionPane.QUESTION_MESSAGE));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese las medidas del lado B","Lado B",JOptionPane.QUESTION_MESSAGE));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese las medidas del lado C","Lado C",JOptionPane.QUESTION_MESSAGE));
        if (num1 == num2 && num2 == num3) {
            JOptionPane.showMessageDialog(null, "Es un triangulo Equilatero","Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
            JOptionPane.showMessageDialog(null, "Es un triangulo Isoceles","Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else if(num1!=num2 || num1!=num3 || num3!=num2){
            JOptionPane.showMessageDialog(null, "Es un triangulo Escaleno","Resultado", JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
