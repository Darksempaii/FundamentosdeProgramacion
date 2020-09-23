
package com.darksempaii.fprogramacion;

//Clases Importadas
import java.text.*;
import javax.swing.*;

public class ConversorMillasMetros {

    public static void main(String[] args) {
        //Entrada Grafica y Conversion de String a Double
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia en millas"));
        //Operacion Aritmetica
        double metros = distancia * 1609;
        //Formato y Salida Gafica
        DecimalFormat df = new DecimalFormat("#0.0");
        JOptionPane.showMessageDialog(null, "La distancia en Metros es: " + df.format(metros));
    }

}
