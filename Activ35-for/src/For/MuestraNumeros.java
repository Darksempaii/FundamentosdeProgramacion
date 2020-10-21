package For;

public class MuestraNumeros {

//Clase main con interrupciones
    public static void main(String[] args) throws InterruptedException {
        //Ciclo de conteo
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            //Interrupcion de 750 milesimas de segundo
            Thread.sleep(750);
        }
        System.exit(0);
    }

}
