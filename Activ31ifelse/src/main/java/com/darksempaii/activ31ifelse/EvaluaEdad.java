package com.darksempaii.activ31ifelse;

import javax.swing.*;

public class EvaluaEdad {

    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Eres mayor de Edad");
        } else {
            JOptionPane.showMessageDialog(null, "Eres menor de Edad");
        }

    }

}
