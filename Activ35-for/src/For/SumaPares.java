
package For;

import javax.swing.JOptionPane;

public class SumaPares {


    public static void main(String[] args) throws InterruptedException {
        int suma =0;
        for (int i = 2; i <= 100; i+=2) {
            suma=suma+i;
            System.out.println("suma: "+suma+" Numero: "+i);
            Thread.sleep(200);
        }
        JOptionPane.showMessageDialog(null, "Suma de pares: "+suma,"Respuesta", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
}
