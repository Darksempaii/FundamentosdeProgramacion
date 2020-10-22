package examen_tema3;

import javax.swing.JOptionPane;

public class Examen_Tema3V4 {

    public static void main(String[] args) throws InterruptedException {
        //Variables Empleadas
        int resultado = 0;
        int multiplicar = 8;
        //multiplicacion
        for (int i = 1; i <= 10; i++) {
            resultado = multiplicar * i;
            System.out.println(multiplicar + "x" + i + "=" + resultado);
            //interrupcion programada
            Thread.sleep(750);
        }
        //Muestra de resultados
        JOptionPane.showMessageDialog(null, "Por favos compruebe la consola", "confirmacion de respuesta", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
