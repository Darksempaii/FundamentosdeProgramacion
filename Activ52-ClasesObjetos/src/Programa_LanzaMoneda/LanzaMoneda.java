package Programa_LanzaMoneda;

public class LanzaMoneda {

    //variables de la clase
    private int numCaras = 0;
    private int numCruces = 0;
    private int numDeLanzamientos;

    //metodo constructor
    public LanzaMoneda(int lanzamientos) {
        this.numDeLanzamientos = lanzamientos;
    }

    //metodo lanzamiento
    private void Lanzamiento() {
        for (int i = 0; i < numDeLanzamientos; i++) {
            int random = (int) (Math.random() * 100);
            if (random <= 50) {
                numCaras++;
            } else if (random >= 51) {
                numCruces++;
            }
        }
    }

    public String toString() {
        Lanzamiento();
        return "El numero de lanzamientos es: " + numDeLanzamientos + "\nNumero de Caras: " + numCaras + "\nnumero de cruces: " + numCruces;
    }
}
