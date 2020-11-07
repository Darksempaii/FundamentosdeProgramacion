
package ArreglosUnidimensionales;

import javax.swing.JOptionPane;

public class SumaPares {


    public static void main(String[] args) {
        int cantidad;
        boolean bucle = false;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos numeros van a ingresas", "Cantidad", JOptionPane.QUESTION_MESSAGE));
        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            do {
                numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Engresa tu " + (i + 1) + "º dato", "Cantidad", JOptionPane.QUESTION_MESSAGE));
                System.out.println(numeros[i]%2);
                if (numeros[i]%2==1) {
                    JOptionPane.showMessageDialog(null, "Ingresastes un numero que no es par.\nPor favor intentalo de nuevo ","Error", JOptionPane.ERROR_MESSAGE);
                    bucle = true;
                } else if (numeros[i]%2 == 0) {
                    bucle = false;
                }
            } while (bucle);
        }
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        JOptionPane.showMessageDialog(null, "el resultado de la suma de pares es: "+suma,"Resultado", JOptionPane.ERROR_MESSAGE);
    }

}
