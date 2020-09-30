package com.darksempaii.activ31ifelse;

import javax.swing.*;

public class ParImpar {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero es Par");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es Impar");
        }
    }

}
