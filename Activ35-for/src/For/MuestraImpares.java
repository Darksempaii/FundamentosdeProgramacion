package For;

import javax.swing.JOptionPane;

public class MuestraImpares {

    public static void main(String[] args) {
        int suma = 0;
        for (int i = 11; i < 150; i += 2) {
            suma = suma + i;
            System.out.println("numero "+i+"suma "+suma);
        }
        JOptionPane.showMessageDialog(null, "Suma de impares: " + suma, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
    }

}
