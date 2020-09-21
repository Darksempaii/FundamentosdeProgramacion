
package com.darksempaii.fprogramacion25;

//clases importadas
import javax.swing.JOptionPane;


public class ConversorCentigradosFahrenheit {

 
    public static void main(String[] args) {
        //Entrada grafica
        String c1 = JOptionPane.showInputDialog("Ingrese la temperatura en grados centígrados");
        //Conversion de String a Double y Operacion Aritmetica
        double c2 = Double.parseDouble(c1);
        double f = 9 / 5 * c2 + 32;
        //Salida Grafica
        JOptionPane.showMessageDialog(null, c2 + " grados Celsius equivalen a " + f + " grados Fahrenheit");
    }
}
