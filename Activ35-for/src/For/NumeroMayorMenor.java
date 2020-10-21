package For;

import javax.swing.JOptionPane;

public class NumeroMayorMenor {

    public static void main(String[] args) {
        int nMayor = 1000000;
        int nMenor = 0;
        int numero;
        for (int i = 1; i <= 5; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", "Dato", JOptionPane.QUESTION_MESSAGE));
            if (nMayor > numero) {
                nMayor = numero;
            } 
            if (nMenor < numero) {
                nMenor = numero;
            }
            System.out.println(nMayor+" "+nMenor+" "+numero);
        }
        JOptionPane.showMessageDialog(null, "Numero mayor:" + nMayor + "\nNumero Menor: " + nMenor, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
    }

}
