package com.darksempaii.activ31ifelse;

import javax.swing.*;

public class EvaluaEdad {

    public static void main(String[] args) {
        int edad;
        do{
        edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el radio del circulo","Dato",JOptionPane.QUESTION_MESSAGE));
        if (edad >= 0 && edad <= 17) {
            JOptionPane.showMessageDialog(null, "Eres menor de Edad","Respuesta", JOptionPane.INFORMATION_MESSAGE);
        } else if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Eres mayor de Edad","Respuesta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "A ingresado una edad incorrecta.\nPor favor intentalo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }while(edad < 0);

    }

}
