
package For;

import javax.swing.JOptionPane;


public class ProyeccionPoblacionVictoria {

    
    public static void main(String[] args) throws InterruptedException {
        //Varables
        int poblacion = 300000;
        int incremento = 0;
        int decremento = 0;
        int d1, i1, itotal;
        for (int i = 0; i <= 5; i++) {
            //Operacion temporal
            i1 = (poblacion / 100)*5;
            d1 = (poblacion / 100);
            //Acumulacion de la temporal
            incremento = incremento + i1;
            decremento = decremento + d1;
            
            //Operacion Principal
            poblacion = poblacion + i1 - d1;
            //Resultado RAW
            System.out.print(poblacion + " " + i1 + " " + d1);
            System.out.println(" "+incremento+" "+decremento);
            //Interrupcion Programada (milesimas de segunto)
            Thread.sleep(750);
        }
        //Resultado en JOptionPane
        JOptionPane.showMessageDialog(null, "poblacion total es de "+poblacion+"\nIncremento neto de "+incremento+"\nDecremento neto de "+decremento+"\nen los proximos 5 años","Estadistica a 5 años", JOptionPane.INFORMATION_MESSAGE);
        //Salida del programa
        System.exit(0);
    }

}
