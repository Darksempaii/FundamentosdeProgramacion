
package com.darksempaii.examentema2;
import java.text.*;
import javax.swing.*;

public class Cilindro {


    public static void main(String[] args) {
        //declaracion de PI
        double area=Math.PI*2;
        //Entrada Grafica y Conversion de String a Double
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del cilindro"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el altura del cirlindro"));
        //Operacion Aritmetica
        area=area*radio*(altura+radio);
        //Salida grafica
        DecimalFormat df1 = new DecimalFormat("#0.000");
        JOptionPane.showMessageDialog(null, "El volumen del cilindro es: " + df1.format(area));
        
    }
    
}
