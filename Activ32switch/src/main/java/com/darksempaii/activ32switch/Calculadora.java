package com.darksempaii.activ32switch;

import javax.swing.*;
import java.text.*;

public class Calculadora {

    public static void main(String[] args) {
        int calculo = Integer.parseInt(JOptionPane.showInputDialog(null, "Elige una opcion: \n1: Suma \n2: Resta \n3: Multiplicacion \n4: Division", "Selector", JOptionPane.QUESTION_MESSAGE));
        double a, b;
        DecimalFormat df = new DecimalFormat("#0.000");
        switch (calculo) {
            case 1:
                a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero", "Introduce", JOptionPane.QUESTION_MESSAGE));
                b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero", "Introduce", JOptionPane.QUESTION_MESSAGE));
                JOptionPane.showMessageDialog(null, "El resultado de la Suma es " + df.format(a + b), "Suma", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero", "Introduce", JOptionPane.QUESTION_MESSAGE));
                b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero", "Introduce", JOptionPane.QUESTION_MESSAGE));
                JOptionPane.showMessageDialog(null, "El resultado de la Resta es " + df.format(a - b), "Resta", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero", "Introduce", JOptionPane.QUESTION_MESSAGE));
                b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero", "Introduce", JOptionPane.QUESTION_MESSAGE));
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es " + df.format(a * b), "Multiplicacion", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero", "Introduce", JOptionPane.QUESTION_MESSAGE));
                b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero", "Introduce", JOptionPane.QUESTION_MESSAGE));
                JOptionPane.showMessageDialog(null, "El resultado de la Division es " + df.format(a / b), "Division", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "La opcion ingresada es incorrecta.\nEjecute el programa de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
