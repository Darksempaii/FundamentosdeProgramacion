package For;

public class EvaluacionFuncion {
    public static void main(String[] args) throws InterruptedException {
        //variables
        int y, x, respuesta;
        //cabezera de la tabla
        String cabecera = "\n\t función de f(x,y)=x*2+y\n";
        cabecera += "\nX\tY\tF(x,y)=x*2+y\n";
        cabecera += "----\t----\t--------------\n";
        //cabezera a consola
        System.out.print(cabecera);
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    //Parte 1 del proceso
                    y = 2;
                    x = 3;
                    for (int j = 1; j <= 4; j++) {
                        respuesta = (x * 2 + y);
                        String tabla = y + "\t" + x + "\t" + respuesta + "\n";
                        System.out.print(tabla);
                        x = x + 3;
                        Thread.sleep(500);
                    }
                    break;
                case 2:
                    //Parte 2 del proceso
                    y = 4;
                    x = 3;
                    for (int j = 1; j <= 3; j++) {
                        respuesta = (x * 2 + y);
                        String tabla = y + "\t" + x + "\t" + respuesta + "\n";
                        System.out.print(tabla);
                        x = x + 3;
                        Thread.sleep(500);
                    }
                    break;
                default:
                    //Ultima parte
                    y = 6;
                    x = 12;
                    respuesta = (x * 2 + y);
                    String tabla = y + "\t" + x + "\t" + respuesta + "\n";
                    System.out.print(tabla);
                    Thread.sleep(500);
                    break;
            }
        }
        System.exit(0);
    }

}
