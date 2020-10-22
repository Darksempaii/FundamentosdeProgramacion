package activ34.pkgdo.pkgwhile;

import javax.swing.JOptionPane;

public class PesoIdeal {

    public static void main(String[] args) {
        String genero[] = {"Hombre", "Mujer"};
        int menu = menu = JOptionPane.showOptionDialog(null, "Selecciona tu genero", "Peso Ideal", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, genero, "Hombre");
        int altura;
        int PesoIdeal = 0;
        boolean llave = true;
        do {
            altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu altura en cm", "Peso Ideal", JOptionPane.QUESTION_MESSAGE));
            if (altura <= 120) {
                JOptionPane.showMessageDialog(null, "No se puede ingresar altura de menos de 120 cm", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (altura >= 250) {
                JOptionPane.showMessageDialog(null, "Enserio es tan alto \nAre como que te creere.", "Peso Ideal", JOptionPane.INFORMATION_MESSAGE);
                llave = false;
            } else {
                llave = false;
            }
        } while (llave);

        switch (menu) {
            case 0:
                PesoIdeal = altura - 110;
                break;
            case 1:
                PesoIdeal = altura - 120;
                break;
        }

        JOptionPane.showMessageDialog(null, "Tu Peso Ideal es de " + PesoIdeal + " KG", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
