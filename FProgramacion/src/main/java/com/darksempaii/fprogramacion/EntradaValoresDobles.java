package com.darksempaii.fprogramacion;

import javax.swing.*;

public class EntradaValoresDobles {

    public static void main(String[] args) {
        //Entrada grafica
        String num1 = JOptionPane.showInputDialog("Introduce tu numero por favor");
        //conversion
        double num2 = Double.parseDouble(num1);
        //salida a consola  
        System.out.print("La raiz de " + num2 + " es ");
        System.out.printf("%1.3f", Math.sqrt(num2));

    }

}
