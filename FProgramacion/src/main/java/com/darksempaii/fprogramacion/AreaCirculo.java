
package com.darksempaii.fprogramacion;

import javax.swing.JOptionPane;


public class AreaCirculo {


    public static void main(String[] args) {
        //declaracion de PI
        double area=Math.PI;
        //Entrada Grafica
        String radio1 = JOptionPane.showInputDialog("Ingrese el radio del circulo");
        //Conversion de String a Double
        double radio2 = Double.parseDouble(radio1);
        //Operacion Aritmetica
        area=area*radio2*radio2;
        //Salida grafica
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + area);
                
    }

}
