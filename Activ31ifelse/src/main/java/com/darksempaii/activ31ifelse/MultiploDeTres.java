
package com.darksempaii.activ31ifelse;

import javax.swing.*;

public class MultiploDeTres {

    public static void main(String[] args) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));

        if (numero % 3 == 0) {
            JOptionPane.showMessageDialog(null, "El numero es multiplo de 3");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es no es multiplo de 3");
        }
    }
    
}
