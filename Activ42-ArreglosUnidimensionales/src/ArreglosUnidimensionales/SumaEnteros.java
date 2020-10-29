
package ArreglosUnidimensionales;


public class SumaEnteros {

    
    public static void main(String[] args) throws InterruptedException {
        int[] numeros = {24, 5, 3, 51, 63, 7, 67, 90, 32, 43};
        int suma = 0;
        System.out.print("los elementos del arreglo son: ");
        for (int i = 0; i < numeros.length; i++) {  
            suma = suma + numeros[i];
            System.out.print(numeros[i]+" ");
            Thread.sleep(500);
        }
        System.out.println("");
        System.out.println("El Total de la suma es: " + suma);
        
        Thread.sleep(5000);
        System.exit(0);
    }

}
