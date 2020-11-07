
package ArreglosUnidimensionales;

import javax.swing.JOptionPane;

public class DeterminaMinimo {

    
    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos numeros van a ingresas", "Cantidad", JOptionPane.QUESTION_MESSAGE));
        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu " + (i + 1) + "º dato", "Cantidad", JOptionPane.QUESTION_MESSAGE));
        }
        int minimo = 999999999;
        System.out.print("Los numeros del arreglo son: ");
        for (int i = 0; i < numeros.length; i++) {
            if (minimo > numeros[i]) {
                minimo = numeros[i];
            }
            System.out.print(numeros[i]+", ");
        }
        System.out.println("");
        System.out.println("y el valor minimo es: "+ minimo);
        JOptionPane.showMessageDialog(null, "El valor minimo del arreglo es:" + minimo, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
    }

}
