
package com.darksempaii.examentema2;
import java.text.*;
import javax.swing.*;

public class Hipotenusa {


    public static void main(String[] args) {
        //Entradas
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro numero"));
        //Operacion aritmetica
        double solucion = (num1*num1)+(num2*num2);
        solucion =  Math.sqrt(solucion);
        //Salida y formato a decimales
        DecimalFormat df1 = new DecimalFormat("#0.000");
        JOptionPane.showMessageDialog(null, "La solucion es: " +df1.format(solucion));
    }
    
}
