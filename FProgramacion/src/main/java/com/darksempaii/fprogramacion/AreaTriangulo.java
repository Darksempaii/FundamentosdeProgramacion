package com.darksempaii.fprogramacion;

import java.text.*;
import javax.swing.*;

public class AreaTriangulo {
    
    public static void main(String[] args) {
        //Entrada Grafica y conversion de String a Double
        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del Triangulo"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del Triangulo"));
        //Operacion Aritmetica
        double area = (base * altura) / 2;
        //Formato y Salida grafica
        DecimalFormat df = new DecimalFormat("#0.00");
        JOptionPane.showMessageDialog(null, "El area del Triangulo es " + df.format(area));
    }
    
}
