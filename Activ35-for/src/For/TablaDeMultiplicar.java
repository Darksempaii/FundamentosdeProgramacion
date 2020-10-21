
package For;
//Librerias Importadas
import javax.swing.JOptionPane;


public class TablaDeMultiplicar {

    
    public static void main(String[] args) throws InterruptedException {
        //Variables Empleadas
        int resultado = 0;
        int multiplicar = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero","Dato",JOptionPane.QUESTION_MESSAGE));
        //Ciclo for y multiplicacion
        for (int i = 1; i <= 10; i++) {
            resultado = multiplicar * i;
            System.out.println(multiplicar+"x"+i+"="+resultado);
            //interrupcion programada
            Thread.sleep(750);
        }
        //Muestra de resultados
        JOptionPane.showMessageDialog(null, "Por favos compruebe la consola", "confirmacion de respuesta", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
