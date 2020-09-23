
package com.darksempaii.fprogramacion;

import javax.swing.*;
import java.text.*;


public class AreaCirculo {


    public static void main(String[] args) {
        //declaracion de PI
        double area=Math.PI;
        //Entrada Grafica y Conversion de String a Double
        double radio2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
        //Operacion Aritmetica
        area=area*radio2*radio2;
        //Formato y Salida grafica
        DecimalFormat df = new DecimalFormat("#0.00");
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + df.format(area));
                
    }

}
