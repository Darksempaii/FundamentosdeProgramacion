
package ArreglosUnidimensionales;

import javax.swing.JOptionPane;


public class SumaValores {


    public static void main(String[] args) {
        int cantidad;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos numeros van a ingresas", "Cantidad", JOptionPane.QUESTION_MESSAGE));
        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Engresa tu "+(i+1)+"º dato", "Cantidad", JOptionPane.QUESTION_MESSAGE));
        }
        int suma = 0;
        System.out.print("los numeros introducidos son: ");
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+suma,"Respuesta", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
