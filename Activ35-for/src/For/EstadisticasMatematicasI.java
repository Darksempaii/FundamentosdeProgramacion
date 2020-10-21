package For;

import javax.swing.JOptionPane;

public class EstadisticasMatematicasI {

    public static void main(String[] args) {
        boolean llave = false;
        int alumnos, Palum, P3G, P3G1, calf;
        int PG1 = 0;
        int PG2 = 0;
        int PG3 = 0;
        //Ingreso de datos
        alumnos = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de alumnos", "Alumnos", JOptionPane.QUESTION_MESSAGE));
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    //Grupo 1
                    for (int j = 1; j <= alumnos; j++) {
                        do {
                            calf = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la calificacion", "Grupo 1", JOptionPane.QUESTION_MESSAGE));
                            if (calf >= 0 && calf <= 10) {
                                PG1 = PG1 + calf;
                                llave = false;
                            } else {
                                //en caso de introducir una calificacion por encima de 10 y por da bajo de 0
                                JOptionPane.showMessageDialog(null, "La calificacion es invalida. \nIntentalo de nuevo ", "Error", JOptionPane.ERROR_MESSAGE);
                                llave = true;
                            }
                        } while (llave);
                    }
                    break;
                case 2:
                    //Grupo 2
                    calf = 0;
                    for (int j = 1; j <= alumnos; j++) {
                        do {
                            calf = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la calificacion", "Grupo 2", JOptionPane.QUESTION_MESSAGE));
                            if (calf >= 0 && calf <= 10) {
                                PG2 = PG2 + calf;
                                llave = false;
                            } else {
                                //en caso de introducir una calificacion por encima de 10 y por da bajo de 0
                                JOptionPane.showMessageDialog(null, "La calificacion es invalida. \nIntentalo de nuevo ", "Error", JOptionPane.ERROR_MESSAGE);
                                llave = true;
                            }
                        } while (llave);
                    }
                    break;
                case 3:
                    //Grupo 3
                    calf = 0;
                    for (int j = 1; j <= alumnos; j++) {
                        do {
                            calf = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la calificacion", "Grupo 3", JOptionPane.QUESTION_MESSAGE));
                            if (calf >= 0 && calf <= 10) {
                                PG3 = PG3 + calf;
                                llave = false;
                            } else {
                                //en caso de introducir una calificacion por encima de 10 y por da bajo de 0
                                JOptionPane.showMessageDialog(null, "La calificacion es invalida. \nIntentalo de nuevo ", "Error", JOptionPane.ERROR_MESSAGE);
                                llave = true;
                            }
                        } while (llave);
                    }
                    break;
            }
        }
        //Operaciones aritmeticas
        //promedio del alumno
        Palum = (PG1 + PG2 + PG3)/alumnos/3;
        //Promedio de cada grupo
        PG1 = PG1 / alumnos;
        PG2 = PG2 / alumnos;
        PG3 = PG3 / alumnos;
        //Promedio de los 3 grupo
        P3G = (PG1 + PG2 + PG3)/3;
        JOptionPane.showMessageDialog(null, "Promedio por alumno: " + Palum+ "\nPromedio del grupo 1: " + PG1 + "\nPromedio del grupo 2: " + PG2 + "\nPromedio del grupo 3: " + PG3 + "\nPromedio de cada grupo: " + P3G, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

}
