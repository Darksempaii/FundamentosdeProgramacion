
package com.darksempaii.examentema2;
import java.text.*;
import javax.swing.*;

public class Calculos {

    public static void main(String[] args) {
        //Entradas
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer numero"));
        //Aritmetica
        double suma = num1+num2+num3;
        double promedio = (num1+num2+num3)/3;
        double producto = (num1*num2*num3);
        //Salida
        DecimalFormat df1 = new DecimalFormat("#0.000");
        JOptionPane.showMessageDialog(null, "El Suma " +suma +"\nPromedio "+promedio+"\nProducto "+df1.format(producto));
    }
    
}
