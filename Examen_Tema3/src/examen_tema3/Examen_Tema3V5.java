package examen_tema3;

import javax.swing.JOptionPane;

public class Examen_Tema3V5 {

    public static void main(String[] args) {
        //Variables Empleadas
        Boolean llave = true;
        int numero, negativo = 0, positivo = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu altura en cm", "Peso Ideal", JOptionPane.QUESTION_MESSAGE));
            //Comprobador de numeros
            if (numero < 0) {
                negativo++;
            } else if (numero > 0) {                
                positivo++;
            } else if (numero == 0) {
                llave = false;
            }
            //Impresion de los numeros ingresados por el usuario
            System.out.println("numero: "+numero);
        } while (llave);
        //Resultado final
        JOptionPane.showMessageDialog(null, "Total de numeros negativos: "+negativo+"\nTotal de numeros positivos: "+positivo, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

}
