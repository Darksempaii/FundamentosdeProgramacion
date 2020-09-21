
package com.darksempaii.fprogramacion;

import static java.lang.Integer.parseInt;
import javax.swing.*;


public class EntradadeDatos {


    public static void main(String[] args) {
        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre por favor");
        String edad = JOptionPane.showInputDialog("Introduce tu nombre por favor");
        int edad_usuario;
        edad_usuario = parseInt(edad);
        edad_usuario++;
        System.out.println("hola " + nombre_usuario + " el siguiente año tendras " + edad_usuario + " años");
        JOptionPane.showMessageDialog(null, "hola " + nombre_usuario + " el siguiente año tendras " + edad_usuario + " años");
    }
    
}
