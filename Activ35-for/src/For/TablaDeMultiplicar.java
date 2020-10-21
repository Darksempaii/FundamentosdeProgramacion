
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
            Thread.sleep(1500);
        }
        //Muestra de resultados
        //JOptionPane.showMessageDialog(null, "Suma de pares: " + resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
