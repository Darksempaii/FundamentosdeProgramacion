package ArreglosUnidimensionales;

public class EvaluacionFuncion {

    public static void main(String[] args) throws InterruptedException {
        //Arreglos
        int x[] = {2, 2, 2, 2, 4, 4, 4, 4, 6, 6, 6, 6};
        int y[] = {3, 6, 9, 12, 3, 6, 9, 12, 3, 6, 9, 12};
        //Construccion de la tabla
        String cabecera = "\n\t función de f(x,y)=x*2+y\n";
        cabecera += "\nX\tY\tF(x,y)=x*2+y\n";
        cabecera += "----\t----\t--------------\n";
        //Tabla
        System.out.print(cabecera);
        for (int i = 0; i < x.length; i++) {
            System.out.print(y[i] + "\t" + x[i] + "\t" + (x[i] * 2 + y[i]) + "\n");
            Thread.sleep(500);
        }
    }

}
