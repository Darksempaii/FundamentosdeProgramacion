
package For;

import javax.swing.JOptionPane;


public class ProyeccionEstudiantilITCV {


    public static void main(String[] args) throws InterruptedException {
        //Varables
        int alumnos = 2100;
        int incremento = 0;
        int i1;
        for (int i = 0; i <= 3; i++) {
            //Operacion temporal
            i1 = (alumnos / 100)*7;
            //Acumulacion de la temporal
            incremento = incremento + i1;
            
            //Operacion Principal
            alumnos = alumnos + i1;
            //Resultado RAW
            System.out.print(alumnos + " " + i1);
            System.out.println(incremento);
            //Interrupcion Programada (milesimas de segunto)
            Thread.sleep(750);
        }
        //Resultado en JOptionPane
        JOptionPane.showMessageDialog(null,"Total de Alumnos es "+alumnos+"\nIncremento de "+incremento+"\nen los proximos 3 años","Estadistica a 5 años", JOptionPane.INFORMATION_MESSAGE);
        //Salida del programa
        System.exit(0);
    }
    
}
