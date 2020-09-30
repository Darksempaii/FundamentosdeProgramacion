package com.darksempaii.activ31ifelse;

import javax.swing.*;

public class NumeroMayor {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero", "Lado A", JOptionPane.QUESTION_MESSAGE));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero", "Lado A", JOptionPane.QUESTION_MESSAGE));
        if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Los numeros son igual", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else if (num1 > num2) {
            JOptionPane.showMessageDialog(null, num1 + " es mayor que " + num2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else if (num1 < num2) {
            JOptionPane.showMessageDialog(null, num1 + " es menor que " + num2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
