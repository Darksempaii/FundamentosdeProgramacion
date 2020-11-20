
package ExamenTema4;


public class ExamenTema4 {


    public static void main(String[] args) {
        String[] productos ={"Refri","Sofá","Estufa","colchón","Comedor"};
        double[ ] precio = {3555.5,8669.6,4665.99,2555.7,8456.2};
        //minimo
        double minimo = 999999999;
        int indiceM = 0;
        System.out.println("Lista de Precios");
        for (int i = 0; i < precio.length; i++) {
            if (minimo > precio[i]) {
                minimo = precio[i];
                indiceM = i;
            }
            System.out.println(productos[i]+"\t"+precio[i]);
        }
        System.out.println("El Articulo con el precio menor es el "+productos[indiceM]+" a un precio de "+precio[indiceM]);
    }
    
}
