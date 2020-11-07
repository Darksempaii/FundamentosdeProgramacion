package ArreglosUnidimensionales;

import javax.swing.JOptionPane;

public class CuentaCeros {

    public static void main(String[] args) {
        //Declaracion del tamaño del arreglo
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos numeros van a ingresas", "Cantidad", JOptionPane.QUESTION_MESSAGE));
        //Introduccion de datos de Tipo string
        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Engresa tu " + (i + 1) + "º dato", "Cantidad", JOptionPane.QUESTION_MESSAGE));
        }
        //Contador de ceros
        int ceros = 0;
        int bucle = 0;
        while (bucle < numeros.length) {
            String datos = Integer.toString(numeros[bucle]);
            for (int j = 0; j < datos.length(); j++) {
                if (datos.charAt(j)=='0') {
                    ceros++;
                }
            }
            bucle++;
        }
        //Salida a consola
        System.out.println("");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
        System.out.println("El total de ceros es: " + ceros);
        //Salida JOptionPane
        JOptionPane.showMessageDialog(null, "La cantidad de ceros introducidos es: " + ceros, "Resultado", JOptionPane.ERROR_MESSAGE);
    }

}
