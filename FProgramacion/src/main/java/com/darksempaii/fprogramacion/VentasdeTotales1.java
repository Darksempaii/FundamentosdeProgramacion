package com.darksempaii.fprogramacion;

import javax.swing.JOptionPane;

public class VentasdeTotales1 {

    public static void main(String[] args) {
        //Entrada Grafica y Conversion de String a Integer
        String nombre_vendedor = JOptionPane.showInputDialog("Ingresa un nombre");
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad vendida del producto A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad vendida del producto B"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad vendida del producto C"));
        //operacion aritmetica
        int total = (200*a) + (500*b) + (350*c);
        //Salida grafica.
        JOptionPane.showMessageDialog(null, "El vendedor " + nombre_vendedor + " vendio " + a + " unidades del producto A, " + b + " unidades del producto B, " + c + " unidades del producto C y su ganancia total fue de " + total + " Pesos Mexicanos");

    }

}
