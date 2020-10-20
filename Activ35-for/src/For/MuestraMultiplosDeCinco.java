package For;

import javax.swing.JOptionPane;

public class MuestraMultiplosDeCinco {

    public static void main(String[] args) {
        int suma = 0;
        for (int i = 10; i <= 200; i += 5) {
            suma = suma + i;
            System.out.println("numero "+i+" suma "+suma);
        }
        JOptionPane.showMessageDialog(null, "Suma de pares: " + suma, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
    }

}
