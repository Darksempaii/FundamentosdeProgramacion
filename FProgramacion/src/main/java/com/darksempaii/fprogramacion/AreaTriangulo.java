package com.darksempaii.fprogramacion;

import javax.swing.JOptionPane;

public class AreaTriangulo {
    
    public static void main(String[] args) {
        //Entrada Grafica
        String base1 = JOptionPane.showInputDialog("Ingrese la base del Triangulo");
        String altura1 = JOptionPane.showInputDialog("Ingrese la altura del Triangulo");
        //conversion de String a Double
        double altura2 = Double.parseDouble(altura1);
        double base2 = Double.parseDouble(base1);
        //Operacion Aritmetica
        double area = (base2 * altura2) / 2;
        //Salida grafica
        JOptionPane.showMessageDialog(null, "El area del Triangulo es " + area);
    }
    
}
