
package For;

import javax.swing.JOptionPane;


public class ComprobacionMail {


    public static void main(String[] args) {
        int arroba=0;
        boolean punto=false;
        String mail =JOptionPane.showInputDialog(null,"Ingresa tu direccion de correo","e-Mail",JOptionPane.QUESTION_MESSAGE);
        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i)=='@') {
                arroba++;
            }
            if (mail.charAt(i)=='.') {
                punto = true;
            }
        }
        if (arroba == 1 && punto==true) {
            JOptionPane.showMessageDialog(null, "Es correcto","e-Mail", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "No es correcto","e-Mail", JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
    
}
