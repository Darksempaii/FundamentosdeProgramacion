
package activ45.arreglosbiidimensionales;

import javax.swing.JOptionPane;

public class CuentaCeros {


    public static void main(String[] args) {
        //Declaracion del tamaño del arreglo
        int columna = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de columnas a usar", "Matriz", JOptionPane.QUESTION_MESSAGE));
        int fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresas el numero de filas a usar", "Matriz", JOptionPane.QUESTION_MESSAGE));
        //Introduccion de datos
        int[][] numeros = new int[fila][columna];
        for (int i = 0; i < columna; i++) {
            for (int j = 0; j < fila; j++) {
                numeros[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Engresa un numero en la columno " + (i + 1) + " de la fila " + (j + 1), "Cantidad", JOptionPane.QUESTION_MESSAGE));
            }
        }
        //conversor de int a String y Contador de ceros
        int ceros = 0;
        String datos;
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    datos = Integer.toString(numeros[i][j]);
                    for (int k = 0; k < datos.length(); k++) {
                        if (datos.charAt(k)=='0') {
                        ceros++;
                        }
                        System.out.println(datos);
                    }
                }
            }
        //Salida a consola 
        System.out.println("");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("El total de ceros es: " + ceros);
        //Salida JOptionPane
        JOptionPane.showMessageDialog(null, "La cantidad de ceros introducidos es: " + ceros, "Resultado", JOptionPane.ERROR_MESSAGE);
    }

}
