
package com.darksempaii.fprogramacion;

//clases importadas
import java.text.*;
import javax.swing.*;

public class ConversorCentigradosFahrenheit {

 
    public static void main(String[] args) {
        //Entrada grafica y Conversion de String a Double
         double c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en grados centígrados"));
        //Operacion Aritmetica
        double f = 9 / 5 * c + 32;
        //Salida Grafica
        DecimalFormat df = new DecimalFormat("#0.00");
        JOptionPane.showMessageDialog(null, df.format(c) + " grados Celsius equivalen a " + df.format(f) + " grados Fahrenheit");
    }
}
