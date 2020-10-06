
package com.darksempaii.activ33while;
import javax.swing.*;

public class AdivinaNumero {

    public static void main(String[] args) {
        int random = (int) (Math.random()*100);
        System.out.println(random);
        int numero = 0 , intento =0;
       while(numero != random){
           intento++;
           numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero del 1 al 100", "Adivina el numero", JOptionPane.QUESTION_MESSAGE));
           if (random<numero && numero <= 100 && numero > 1) {
               JOptionPane.showMessageDialog(null, "Mas bajo que "+numero, "Pista", JOptionPane.INFORMATION_MESSAGE);   
           } else if (random>numero && numero <= 100 && numero > 1) {
               JOptionPane.showMessageDialog(null, "Mas alto que "+numero , "Pista", JOptionPane.INFORMATION_MESSAGE);
           } else if (numero >= 101) {
               JOptionPane.showMessageDialog(null, "perdon pero no aceptamos numeros mayores de 100 \nIntentalo de nuevo", "Advertencia", JOptionPane.WARNING_MESSAGE);
           } else if (numero < 0) {
               JOptionPane.showMessageDialog(null, "perdon pero no aceptamos numeros negativos \nIntentalo de nuevo", "Advertencia", JOptionPane.WARNING_MESSAGE);
           } else if (numero == 0) {
               JOptionPane.showMessageDialog(null, "No hay nada malo con el 0 \npero no creo que entre en nuestra \nlista de numeros", "Advertencia", JOptionPane.WARNING_MESSAGE);
           }
       
       }
       JOptionPane.showMessageDialog(null, "Correcto, Lo has conseguido en "+intento+" intentos", "Ganastes", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
