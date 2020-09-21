package com.darksempaii.fprogramacion;

import javax.swing.JOptionPane;

public class VentasdeTotales1 {

    public static void main(String[] args) {
        //Entrada Grafica.
        String nombre_vendedor = JOptionPane.showInputDialog("Ingresa un nombre");
        String a1 = JOptionPane.showInputDialog("Ingresa la cantidad vendida del producto A");
        String b1 = JOptionPane.showInputDialog("Ingresa la cantidad vendida del producto B");
        String c1 = JOptionPane.showInputDialog("Ingresa la cantidad vendida del producto C");
        //Conversion de String a Integer y sus operaciones aritmeticas.
        int a2 = 200 * Integer.parseInt(a1);
        int b2 = 500 * Integer.parseInt(b1);
        int c2 = 200 * Integer.parseInt(c1);
        int total = a2 + b2 + c2;
        //Salida grafica.
        JOptionPane.showMessageDialog(null, "El vendedor " + nombre_vendedor + " vendio " + a1 + " unidades del producto A, " + b1 + " unidades del producto B, " + c1 + " unidades del producto C y su ganancia total fue de " + total + " Pesos Mexicanos");

    }

}
