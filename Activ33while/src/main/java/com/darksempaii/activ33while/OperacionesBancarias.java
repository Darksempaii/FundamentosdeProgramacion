
package com.darksempaii.activ33while;

import javax.swing.*;

public class OperacionesBancarias {

    
    public static void main(String[] args) {
        //Arreglos de Objetos
        String principal[] = {"Depositos", "Retiros", "Consulta", "Salir"};
        String cantidades[] = {"50", "100", "200", "500", "1000", "Ingresar un m0nto", "cancelar"};
        //Variables
        int intento = 0;
        int pass, menu, cantidad, ingreso;
        int clave = 1234;
        int monto = 5000;
        //Login
        do {
            intento++;
            pass = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el NIP", "Login", JOptionPane.QUESTION_MESSAGE));
            if (clave == pass) {
                JOptionPane.showMessageDialog(null, "contraseña correcta", "Login", JOptionPane.INFORMATION_MESSAGE);
                intento = 4;
            } else if (clave != pass) {
                JOptionPane.showMessageDialog(null, "contraseña incorrecta le quedan " + intento + " de 3", "Login", JOptionPane.WARNING_MESSAGE);
            }
        } while (intento >= 0 && intento < 3);
        intento = 1;
        if (clave != pass) {
            //Login incorrecto
            JOptionPane.showMessageDialog(null, "Exedio el numero de intentos \nPor favor intentelo mas tarde", "Respuesta", JOptionPane.ERROR_MESSAGE);
        } else if (clave == pass) {
            //Login correcto
            do {
                menu = JOptionPane.showOptionDialog(null, "Que accion desea realizar", "Banca", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, principal, "Retiros");
                System.out.println(menu);
                switch (menu) {
                    case 0:
                        //Depositos
                        cantidad = JOptionPane.showOptionDialog(null, "Dispone de " + monto + "\nCuanto desea depositar", "Deposito", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, cantidades, "50");
                        switch (cantidad) {
                            case 0:
                                monto = monto + 50;
                                JOptionPane.showMessageDialog(null, "Su monto ahora es de: " + monto, "Deposito", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 1:
                                monto = monto + 100;
                                JOptionPane.showMessageDialog(null, "Su monto ahora es de: " + monto, "Deposito", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 2:
                                monto = monto + 200;
                                JOptionPane.showMessageDialog(null, "Su monto ahora es de: " + monto, "Deposito", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 3:
                                monto = monto + 500;
                                JOptionPane.showMessageDialog(null, "Su monto ahora es de: " + monto, "Deposito", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 4:
                                monto = monto + 1000;
                                JOptionPane.showMessageDialog(null, "Su monto ahora es de: " + monto, "Deposito", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 5:
                                ingreso = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto a depositar", "Deposito", JOptionPane.QUESTION_MESSAGE));
                                monto = monto + ingreso;
                                JOptionPane.showMessageDialog(null, "Su monto ahora es de: " + monto, "Deposito", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            default:

                        }
                        break;
                    case 1:
                        //Retiros
                        cantidad = JOptionPane.showOptionDialog(null, "Dispone de " + monto + "\nCuanto desea depositar", "Deposito", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, cantidades, "50");
                        switch (cantidad) {
                            case 0:
                                ingreso = 50;
                                monto = monto - ingreso;
                                if (monto < 0) {
                                    JOptionPane.showMessageDialog(null, "No cuenta con los fondos suficientes para realizar la transaccion", "Retiros", JOptionPane.ERROR_MESSAGE);
                                    monto = monto + ingreso;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Su monto ahora es de: " + monto, "Retiros", JOptionPane.INFORMATION_MESSAGE);
                                }
                                ingreso = 0;
                                break;
                            case 1:
                                ingreso = 100;
                                monto = monto - ingreso;
                                if (monto < 0) {
                                    JOptionPane.showMessageDialog(null, "No cuenta con los fondos suficientes para realizar la transaccion", "Retiros", JOptionPane.ERROR_MESSAGE);
                                    monto = monto + ingreso;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Su monto ahora es de: " + monto, "Retiros", JOptionPane.INFORMATION_MESSAGE);
                                }
                                ingreso = 0;
                                break;
                            case 2:
                                ingreso = 200;
                                monto = monto - ingreso;
                                if (monto < 0) {
                                    JOptionPane.showMessageDialog(null, "No cuenta con los fondos suficientes para realizar la transaccion", "Retiros", JOptionPane.ERROR_MESSAGE);
                                    monto = monto + ingreso;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Su monto ahora es de: " + monto, "Retiros", JOptionPane.INFORMATION_MESSAGE);
                                }
                                ingreso = 0;
                                break;
                            case 3:
                                ingreso = 500;
                                monto = monto - ingreso;
                                if (monto < 0) {
                                    JOptionPane.showMessageDialog(null, "No cuenta con los fondos suficientes para realizar la transaccion", "Retiros", JOptionPane.ERROR_MESSAGE);
                                    monto = monto + ingreso;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Su monto ahora es de: " + monto, "Retiros", JOptionPane.INFORMATION_MESSAGE);
                                }
                                ingreso = 0;
                                break;
                            case 4:
                                ingreso = 1000;
                                monto = monto - ingreso;
                                if (monto < 0) {
                                    JOptionPane.showMessageDialog(null, "No cuenta con los fondos suficientes para realizar la transaccion", "Retiros", JOptionPane.ERROR_MESSAGE);
                                    monto = monto + ingreso;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Su monto ahora es de: " + monto, "Retiros", JOptionPane.INFORMATION_MESSAGE);
                                }
                                ingreso = 0;
                                break;
                            case 5:
                                ingreso = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto a depositar", "Retiros", JOptionPane.QUESTION_MESSAGE));
                                monto = monto - ingreso;
                                if (monto < 0) {
                                    JOptionPane.showMessageDialog(null, "No cuenta con los fondos suficientes para realizar la transaccion", "Retiros", JOptionPane.ERROR_MESSAGE);
                                    monto = monto + ingreso;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Su monto ahora es de: " + monto, "Retiros", JOptionPane.INFORMATION_MESSAGE);
                                }
                                ingreso = 0;
                                break;
                            default:

                        }
                        break;
                    case 2:
                        //Counsulta
                        JOptionPane.showMessageDialog(null, "Su monto ahora es de: " + monto, "Consulta", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        //Salida
                        intento = JOptionPane.showConfirmDialog(null, "Desea salir del su cuenta");
                        break;
                    default:
                        break;
                }

            } while (intento >= 1 && intento <= 2);
            
        }
        
                    if (clave == pass) {   
            JOptionPane.showMessageDialog(null,"Se ha cerrado sesion correctamente","Login", JOptionPane.INFORMATION_MESSAGE);
            
            }
    }

}
