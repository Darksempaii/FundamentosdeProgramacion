
package ArreglosUnidimensionales;

import javax.swing.JOptionPane;


public class DeterminaMaximo {


    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos numeros van a ingresas", "Cantidad", JOptionPane.QUESTION_MESSAGE));
        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu " + (i + 1) + "º dato", "Cantidad", JOptionPane.QUESTION_MESSAGE));
        }
        int maximo = 0;
        System.out.print("Los numeros del arreglo son: ");
        for (int i = 0; i < numeros.length; i++) {
            if (maximo < numeros[i]) {
                maximo = numeros[i];
            }
            System.out.print(numeros[i]+", ");
        }
        System.out.println("");
        System.out.println("y el valor maximo es: "+ maximo);
        JOptionPane.showMessageDialog(null, "El valor maximo del arreglo es:" + maximo, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
