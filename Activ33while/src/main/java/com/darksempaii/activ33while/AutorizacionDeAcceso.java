package com.darksempaii.activ33while;

import javax.swing.*;

public class AutorizacionDeAcceso {

    public static void main(String[] args) {
        String clave = "cesar";
        String pass = "";
        while (clave.equals(pass) == false) {
            pass = JOptionPane.showInputDialog(null, "Introduce la contraseña, por favor", "Login", JOptionPane.QUESTION_MESSAGE);
            if (clave.equals(pass) == false) {
                JOptionPane.showMessageDialog(null, "La contraseña es incorrecta.\nPor favor intentalo de nuevo", "Login", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "La contraseña es correcta, Acceso permitido", "Login", JOptionPane.INFORMATION_MESSAGE);
    }

}
