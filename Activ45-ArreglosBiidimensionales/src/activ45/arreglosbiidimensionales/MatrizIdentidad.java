
package activ45.arreglosbiidimensionales;


public class MatrizIdentidad {


    public static void main(String[] args) throws InterruptedException {
        //Introduccion de datos
        int[][] numeros = new int[5][5];
        //llenado de la matriz
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (i == j) {
                    numeros[i][j]=1;
                }else{
                    numeros[i][j]=0;
                }
            }
        }
        //salida a consola
        System.out.println("");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j]);
                Thread.sleep(150);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
