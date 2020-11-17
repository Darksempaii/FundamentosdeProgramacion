
package activ45.arreglosbiidimensionales;

import javax.swing.JOptionPane;


public class MuestraMatrizEnConsola {


    public static void main(String[] args) {
        int columna = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de columnas a usar", "Matriz", JOptionPane.QUESTION_MESSAGE));
        int fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresas el numero de filas a usar", "Matriz", JOptionPane.QUESTION_MESSAGE));
        //Introduccion de datos
        int[][] numeros = new int[fila][columna];
        for (int i = 0; i < columna; i++) {
            for (int j = 0; j < fila; j++) {
                numeros[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Engresa un numero en la columno " + (i + 1) + " de la fila " + (j + 1), "Cantidad", JOptionPane.QUESTION_MESSAGE));
            }
        }
        //Salida a consola 
        System.out.println("Matriz");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
}
