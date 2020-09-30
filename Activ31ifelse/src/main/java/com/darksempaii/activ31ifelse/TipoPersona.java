package com.darksempaii.activ31ifelse;

import javax.swing.*;

public class TipoPersona {

    public static void main(String[] args) {
        int edad;
        do {
            edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad de la persona","Dato",JOptionPane.QUESTION_MESSAGE));
            if (edad >= 0 && edad <= 5) {
                JOptionPane.showMessageDialog(null, "Es un bebe", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else if (edad >= 6 && edad <= 12) {
                JOptionPane.showMessageDialog(null, "Es un niño", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else if (edad >= 13 && edad <= 18) {
                JOptionPane.showMessageDialog(null, "Es un Adolecente", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else if (edad >= 19 && edad <= 25) {
                JOptionPane.showMessageDialog(null, "Es un Joven", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else if (edad >= 26 && edad <= 60) {
                JOptionPane.showMessageDialog(null, "Es un Adulto", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else if (edad >= 60) {
                JOptionPane.showMessageDialog(null, "Es un Adulto de la 3º edad", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "A ingresado una edad incorrecta.\nPor favor intentalo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (edad < 0);
    }

}
