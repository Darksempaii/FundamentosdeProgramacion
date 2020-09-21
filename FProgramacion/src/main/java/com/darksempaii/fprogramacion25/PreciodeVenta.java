
package com.darksempaii.fprogramacion25;

import javax.swing.*;

public class PreciodeVenta {

    public static void main(String[] args) {
        //Entrada Grafica
        String costo1 = JOptionPane.showInputDialog("Ingrese el Costo de fabricacion del automovil");
        //Conversion y Aritmetica del programa
        double costo2 = Double.parseDouble(costo1);
        double impuesto = (costo2/100)*16;
        double total = (costo2+impuesto);
        //Salida Grafica
        JOptionPane.showMessageDialog(null, "El impuesto del automovil es de " + impuesto + " y el total del automovil seria " + total);
        
        
    }
    
}
