
package com.darksempaii.examentema2;
import java.text.*;
import javax.swing.*;

public class Cilindro {


    public static void main(String[] args) {
        //declaracion de PI
        double area=Math.PI;
        //Entrada Grafica y Conversion de String a Double
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
        //Operacion Aritmetica
        area=area*radio*radio*(altura+radio);
        //Salida grafica
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + area);
        
    }
    
}
