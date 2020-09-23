
package com.darksempaii.fprogramacion;

import java.text.*;
import javax.swing.*;

public class PreciodeVenta {

    public static void main(String[] args) {
        //Entrada Grafica y Conversion
        double costo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Costo de fabricacion del automovil"));
        //Aritmetica del programa
        double impuesto = (costo/100)*16;
        double total = (costo+impuesto);
        //Salida Grafica
        DecimalFormat df = new DecimalFormat("#0.00");
        JOptionPane.showMessageDialog(null, "El impuesto del automovil es de " + df.format(impuesto) + " pesos y el total del automovil seria " + df.format(total)+ " pesos");
        
        
    }
    
}
