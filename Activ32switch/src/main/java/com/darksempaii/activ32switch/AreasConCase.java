package com.darksempaii.activ32switch;

import javax.swing.*;

public class AreasConCase {

    public static void main(String[] args) {
        int figura = Integer.parseInt(JOptionPane.showInputDialog(null, "Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo", "Selector", JOptionPane.QUESTION_MESSAGE));
        int lado,base,altura ;
          
        switch (figura) {
            case 1:
                lado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el lado", "Introduce", JOptionPane.QUESTION_MESSAGE));
                JOptionPane.showMessageDialog(null, "El area del cuedrado es "+ Math.pow(lado, 2), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                base = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Base", "Introduce", JOptionPane.QUESTION_MESSAGE));
                altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Altura", "Introduce", JOptionPane.QUESTION_MESSAGE));
                JOptionPane.showMessageDialog(null, "El area del Rectangulo es "+(base*altura), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Base", "Introduce", JOptionPane.QUESTION_MESSAGE));
                altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Altura", "Introduce", JOptionPane.QUESTION_MESSAGE));
                JOptionPane.showMessageDialog(null, "El area del Rectangulo es "+(base*altura)/2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
                JOptionPane.showMessageDialog(null, "El area del Rectangulo es "+Math.PI*(Math.pow(radio,2)), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                throw new AssertionError();
        }

    }

}
