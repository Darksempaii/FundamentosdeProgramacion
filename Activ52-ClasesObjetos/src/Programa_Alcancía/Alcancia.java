package Programa_Alcancía;

public class Alcancia {

    //Variables de la clase
    private String Nombre;
    private int monto = 0;
    private int[] billetes = {0, 0, 0, 0, 0};
    private int noAhorrado = 0;
    private int[] cantidades = {20, 50, 100, 200, 500};

    //constructor de la clase Alcancia
    public Alcancia(String nom,int monto) {
        this.Nombre = nom;
        this.monto = monto;

    }
    @Override
    public String toString(){
    
        return "El ahorro total de "+Nombre+" es de: "+calcualarTotalAhorrado()+"\nDinero ahorrado que no esta en la alcancia "+noAhorrado+"\ny el total de billetes es de \n"+ mostrarMonedas();
    }
    //metodo ahorrar
    private void Ahorrar() {
        boolean Bucle = true;
        int Monto = monto;
        do {
            if (Monto >= 20 && Monto <= 49) {
                billetes[0]++;
                Monto = Monto - 20;
            } else if (Monto >= 50 && Monto <= 100) {
                billetes[1]++;
                Monto = Monto - 50;
            } else if (Monto >= 100 && Monto <= 199) {
                billetes[2]++;
                Monto = Monto - 100;
            } else if (Monto >= 200 && Monto <= 499) {
                billetes[3]++;
                Monto = Monto - 200;
            } else if (Monto >= 500) {
                billetes[4]++;
                Monto = Monto - 500;
            } else {
                noAhorrado = noAhorrado + Monto;
                Monto = 0;
                Bucle = false;
            }
        } while (Bucle);
        monto = Monto;
    }
    //metodo Mostrar ahorros indexados
    public String mostrarMonedas() {
        String mostrar = "";
        if (monto != 0) {
            Ahorrar();
        }
        for (int i = 0; i < billetes.length; i++) {
            mostrar = mostrar + (cantidades[i] + "\t" + billetes[i] + "\n");
        }
        return mostrar;
    }
    //Metodo Calculo del total del ahorro
    public int calcualarTotalAhorrado() {
        Ahorrar();
        int ahorro = 0;
        for (int i = 0; i < cantidades.length; i++) {
            for (int j = 1; j <= billetes[i]; j++) {
                    ahorro = ahorro + cantidades[i];
            }
        }
        ahorro = ahorro + noAhorrado;
        return ahorro;
    }
    //Metodo borrar ahorro
    public String romperAlcancia() {
        for (int i = 0; i < billetes.length; i++) {
            billetes[i] = 0;
        }
        monto = 0;
        noAhorrado = 0;
        return Nombre+" haz roto la alcancia\n"+"Tu Ahorro es de "+calcualarTotalAhorrado()+"\nDinero ahorrado que no esta en la alcancia "+noAhorrado+"\ny tu total de billetes es de \n"+ mostrarMonedas();
    }

}
