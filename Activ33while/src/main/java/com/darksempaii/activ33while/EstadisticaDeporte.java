package com.darksempaii.activ33while;

import javax.swing.*;

public class EstadisticaDeporte {

    public static void main(String[] args) {
        //Arrays
        String Modo[] = {"opciones Multiple", "Opcion libre", "Salir"};
        String Selector[] = {"Futbol", "Beisbol", "Tenis", "Basquetbol", "Salir"};
        //variables
        int reintentos, errores, futbol, beisbol, tenis, basquetbol, alumnos;
        int modo, selector;
        //Inicio del programa
        while (true) {
            modo = JOptionPane.showOptionDialog(null, "Escoje como quieres que se ejecute el programa", "modo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, Modo, "Retiros");
            switch (modo) {
                case 0:
                    //Opcion Multiple
                    futbol = beisbol = tenis = basquetbol = alumnos = 0;
                    while (true) {
                        selector = JOptionPane.showOptionDialog(null, "Que deporte deseas practicar", "Selector", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, Selector, "Futbol");
                        switch (selector) {
                            case 0://Futbol
                                futbol++;
                                alumnos++;
                                JOptionPane.showMessageDialog(null, "Gracias por entrar a Futbol", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 1://Beisbol
                                beisbol++;
                                alumnos++;
                                JOptionPane.showMessageDialog(null, "Gracias por entrar a Beisbol", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 2://Tenis
                                tenis++;
                                alumnos++;
                                JOptionPane.showMessageDialog(null, "Gracias por entrar a Tenis", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 3://Basquetbol
                                basquetbol++;
                                alumnos++;
                                JOptionPane.showMessageDialog(null, "Gracias por entrar a Basquetbol", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Alumnos totales: " + alumnos + "\nFutbol: " + futbol + "\nBeisbol: " + beisbol + "\nTenis: " + tenis + "\nBasquetbol: " + basquetbol, "Resultado Final", JOptionPane.DEFAULT_OPTION);
                                System.exit(modo);
                        }
                    }
                case 1:
                    //Opcion Libre
                    futbol = beisbol = tenis = basquetbol = alumnos = errores = reintentos =0;
                    while (true) {
                        selector = Integer.parseInt(JOptionPane.showInputDialog(null,"selecciones un numero segun el deporte que este en la lista\n1.Futbol \n2Beisbol \n3.Tenis \n4.Basquetbol \n5.Salir","selecciona un deporte",JOptionPane.QUESTION_MESSAGE));
                        switch (selector) {
                            case 1://Futbol
                                errores = 0;
                                futbol++;
                                alumnos++;
                                JOptionPane.showMessageDialog(null, "Gracias por entrar a Futbol", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 2://Beisbol
                                errores = 0;
                                beisbol++;
                                alumnos++;
                                JOptionPane.showMessageDialog(null, "Gracias por entrar a Beisbol", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 3://Tenis
                                errores = 0;
                                tenis++;
                                alumnos++;
                                JOptionPane.showMessageDialog(null, "Gracias por entrar a Tenis", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 4://Basquetbol
                                errores = 0;
                                basquetbol++;
                                alumnos++;
                                JOptionPane.showMessageDialog(null, "Gracias por entrar a Basquetbol", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 5://salir
                                JOptionPane.showMessageDialog(null, "Alumnos totales: " + alumnos + "\nFutbol: " + futbol + "\nBeisbol: " + beisbol + "\nTenis: " + tenis + "\nBasquetbol: " + basquetbol+"\nErrores en respuesta: "+reintentos, "Resultado Final", JOptionPane.DEFAULT_OPTION);
                                System.exit(modo);
                            default://Errores
                                errores++;
                                if (errores>=1&&errores<3) {
                                    JOptionPane.showMessageDialog(null, "El numero no seleccionado no existe \nllevas "+errores+" de 3 intentos", "Advertencia", JOptionPane.WARNING_MESSAGE);
                                    System.out.println(errores);
                                } else if (errores==3) {
                                    JOptionPane.showMessageDialog(null, "Se te han ternimado los intentos", "Error", JOptionPane.ERROR_MESSAGE);
                                    reintentos++;
                                    errores = 0;
                                }
                        }
                    }

                case 2:
                    //Salida
                    System.exit(modo);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

}
