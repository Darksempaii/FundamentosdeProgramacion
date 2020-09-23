package com.darksempaii.fprogramacion;

import java.text.DecimalFormat;
import javax.swing.*;

public class Residuo {

    public static void main(String[] args) {
        //Entrada y conversion de String a Float
        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el dividendo"));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el divisor"));
        //Proceso
        float c = num1 / num2;
        float r = num1 % num2;
        //Salida
        DecimalFormat residuo = new DecimalFormat("#0.00");
        DecimalFormat conciente = new DecimalFormat("#0");
        JOptionPane.showMessageDialog(null, "El conciente es: " + conciente.format(c) + " y su residuo es de: " + residuo.format(r));
    }

}
