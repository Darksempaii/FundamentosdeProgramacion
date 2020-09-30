package com.darksempaii.activ31ifelse;

import javax.swing.*;

public class NumeroMayor {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        if (num1 == num2) {
            JOptionPane.showMessageDialog(null,"Los numeros son igual");
        } else if (num1 > num2) {
            JOptionPane.showMessageDialog(null, num1+ " es mayor que " +num2);
        } else if (num1 < num2) {
            JOptionPane.showMessageDialog(null, num1+ " es menor que " +num2);
        }
    }

}
