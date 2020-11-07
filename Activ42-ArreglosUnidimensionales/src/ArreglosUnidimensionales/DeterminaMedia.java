
package ArreglosUnidimensionales;

import javax.swing.JOptionPane;

public class DeterminaMedia {

    
    public static void main(String[] args) {
        int cantidad;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos numeros van a ingresas", "Cantidad", JOptionPane.QUESTION_MESSAGE));
        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos numeros van a ingresas", "Cantidad", JOptionPane.QUESTION_MESSAGE));
        }
        int medio = 0;
        System.out.print("los numeros introducidos son: ");
        for (int i = 0; i < numeros.length; i++) {
            medio = medio + numeros[i];
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
        System.out.println("la media es de " + medio/numeros.length);
    }

}
