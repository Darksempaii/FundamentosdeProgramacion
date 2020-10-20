
package For;

import javax.swing.JOptionPane;
import java.math.BigInteger;

public class Factorial {
  
    
    public static void main(String[] args) {
        //Variable y Creacion de objeto BigInteger iniciado en 1
        String numero = JOptionPane.showInputDialog(null, "Introduce un numero", "Factorial", JOptionPane.QUESTION_MESSAGE);
        BigInteger var = new BigInteger("1");
        //Ciclo For y Operacion cin BigInterger
        for (int i = Integer.parseInt(numero); i > 0; i--) {
            var = var.multiply(new BigInteger(Integer.toString(i)));
        }
        //Mensaje de repuesta y salida del programa
        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es " + var, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
}
