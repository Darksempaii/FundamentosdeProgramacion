package com.darksempaii.fprogramacion;
//Clases importadas para el funcionamiento del programa
import static java.lang.Integer.parseInt;
import javax.swing.*;

public class EntradadeDatos {

    public static void main(String[] args) {
        //Entrada grafica
        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre por favor");
        String edad = JOptionPane.showInputDialog("Introduce tu edad por favor");
        //conversion a de la variable y su porterior manipulacion
        int edad_usuario = parseInt(edad);
        edad_usuario++;
        //salida grafica
        JOptionPane.showMessageDialog(null, "Hola " + nombre_usuario + " el siguiente año tendras " + edad_usuario + " años.");
    }

}
