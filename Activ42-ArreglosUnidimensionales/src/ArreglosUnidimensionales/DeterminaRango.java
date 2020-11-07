
package ArreglosUnidimensionales;

import javax.swing.JOptionPane;

public class DeterminaRango {

    
    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos numeros van a ingresas", "Cantidad", JOptionPane.QUESTION_MESSAGE));
        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu " + (i + 1) + "º dato", "Cantidad", JOptionPane.QUESTION_MESSAGE));
        }
        int mayor, menor;
        mayor = menor = numeros[0];
        System.out.print("Los numeros del arreglo son: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            } 
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            System.out.print(numeros[i]+", ");
        }
        System.out.println("");
        System.out.println("El rango de mínimo y máximo del arreglo es: "+ menor+" - "+mayor);
        JOptionPane.showMessageDialog(null, "El rango de mínimo y máximo del arreglo es: "+menor+" - "+mayor , "Respuesta", JOptionPane.INFORMATION_MESSAGE);
    }

}
