package com.darksempaii.activ31ifelse;

import javax.swing.*;

public class ParImpar {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero", "Dato", JOptionPane.QUESTION_MESSAGE));

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero es Par", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El numero es Impar", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
