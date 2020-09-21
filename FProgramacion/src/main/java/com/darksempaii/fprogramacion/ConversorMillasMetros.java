
package com.darksempaii.fprogramacion;

//Clases Importadas
import javax.swing.JOptionPane;

public class ConversorMillasMetros {

    public static void main(String[] args) {
        //Entrada Grafica
        String distancia1 = JOptionPane.showInputDialog("Ingrese la distancia en millas");
        //Conversion de String a Double y Operacion Aritmetica
        double distancia2 = Double.parseDouble(distancia1);
        double metros = distancia2 * 1609;
        //Salida Gafica
        JOptionPane.showMessageDialog(null, "La distancia en Metros es: " +metros);
    }

}
