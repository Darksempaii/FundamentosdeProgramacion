
package activ45.arreglosbiidimensionales;


public class ConsecutivosColumnas {


    public static void main(String[] args) throws InterruptedException {
        //Declaracion del arreglo
        int [][] numeros = {{1,6,11,16,21,26},{2,7,12,17,22,27},{3,8,13,18,23,28},{4,9,14,19,24,29},{5,10,15,20,25,30}};
        //Salida a consola 
        System.out.println("");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
                Thread.sleep(250);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
