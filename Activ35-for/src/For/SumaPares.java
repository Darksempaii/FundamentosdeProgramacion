
package For;

import javax.swing.JOptionPane;

public class SumaPares {


    public static void main(String[] args) {
        int suma =0;
        for (int i = 2; i < 100; i+=2) {
            suma=suma+i;
        }
        JOptionPane.showMessageDialog(null, "Suma de pares: "+suma,"Respuesta", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
