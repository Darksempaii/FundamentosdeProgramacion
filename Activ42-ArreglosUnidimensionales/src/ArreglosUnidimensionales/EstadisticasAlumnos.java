package ArreglosUnidimensionales;

import javax.swing.JOptionPane;

public class EstadisticasAlumnos {

    public static void main(String[] args) {
        //variable universal
        int cantidad;
        //Grupo 1
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de alumnos a evaluar del Grupo 1", "Alumnos", JOptionPane.QUESTION_MESSAGE));
        int n1a = cantidad;
        int[] n1c = new int[n1a];
        int n1t = 0;
        for (int i = 0; i < n1c.length; i++) {
            n1c[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la calificacion del " + (i + 1) + "º alumno", "Alumnos", JOptionPane.QUESTION_MESSAGE));
            n1t = n1t + n1c[i];
        }
        int n1pa = n1t / n1c.length;
        //Grupo 2
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de alumnos a evaluar del Grupo 2", "Alumnos", JOptionPane.QUESTION_MESSAGE));
        int n2a = cantidad;
        int[] n2c = new int[n2a];
        int n2t = 0;
        for (int i = 0; i < n2c.length; i++) {
            n2c[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la calificacion del " + (i + 1) + "º alumno", "Alumnos", JOptionPane.QUESTION_MESSAGE));
            n2t = n2t + n2c[i];
        }
        int n2pa = n2t / n2c.length;
        //Grupo 3
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de alumnos a evaluar del Grupo 3", "Alumnos", JOptionPane.QUESTION_MESSAGE));
        int n3a = cantidad;
        int[] n3c = new int[n3a];
        int n3t = 0;
        for (int i = 0; i < n3c.length; i++) {
            n3c[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la calificacion del " + (i + 1) + "º alumno", "Alumnos", JOptionPane.QUESTION_MESSAGE));
            n3t = n3t + n3c[i];
        }
        int n3pa = n3t / n3c.length;
        //Resultados
        int ta = n1pa + n2pa + n3pa;
        System.out.println(ta);
        int tc = n1t + n2t + n3t;
        System.out.println(tc);
        int promediot = tc / ta;
        JOptionPane.showMessageDialog(null, "La cantidad de alumnos es: " + ta + " \nLos promedios de cada alumno es: " + promediot + " \ny los promedios por Grupos son \nGrupo 1: " + n1pa + " Grupo 2: " + n2pa + " Grupo 3: " + n3pa, "Resultado", JOptionPane.ERROR_MESSAGE);

    }

}
