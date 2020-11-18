
package activ45.arreglosbiidimensionales;

import javax.swing.JOptionPane;


public class SumaPares {


    public static void main(String[] args) {
        //Declaracion del tamaño del arreglo
        int columna = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de columnas a usar", "Matriz", JOptionPane.QUESTION_MESSAGE));
        int fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresas el numero de filas a usar", "Matriz", JOptionPane.QUESTION_MESSAGE));
        //Introduccion de datos
        int[][] numeros = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                numeros[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Engresa un numero en la fila " + (i + 1) + " de la columna " + (j + 1), "Cantidad", JOptionPane.QUESTION_MESSAGE));
            }
        }
        //Suma de la matriz
        int suma = 0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                suma = suma+numeros[i][j];
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
        System.out.println("El resultado de la suma de la matriz es: "+suma);
        //Salida Grafica
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
