package com.darksempaii.fprogramacion;

import javax.swing.JOptionPane;

public class Residuo {

    public static void main(String[] args) {
        //Variables
        float c, r;
        //Entrada
        String num1 = JOptionPane.showInputDialog("Ingrese el dividendo");
        String num2 = JOptionPane.showInputDialog("Ingrese el divisor");
        //conversion de String a Float
        float num3 = Float.parseFloat(num1);
        float num4 = Float.parseFloat(num2);
        //Proceso
        c = num3 / num4;
        r = num3 % num3;
        //Salida
        JOptionPane.showMessageDialog(null, "El conciente es: " + c + " y su residuo es de: " + r);
    }

}
