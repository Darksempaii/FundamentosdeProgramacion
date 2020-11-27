package Programa_Persona;

public class Persona {

    //variables privadas de la clase
    private String Nombre;
    private String Apellido;
    private int edad;
    private double temperatura;

    public Persona(String nom, String ape, int edad1, double temp) {//metodo constructor
        this.Nombre = nom;
        this.Apellido = ape;
        this.edad = edad1;
        this.temperatura = temp;
    }

    public String toString() { //retorno de los atributos de la clase
        return Nombre + " " + Apellido + "\n" + tipoDePersona() + " de " + edad + " Edad."+"\nEl tiene un temperatura de "+temperatura+" grados y el "+estadoDeSalud();
    }

    private String tipoDePersona() { //clasificacion de la persona
        String persona = null;
        if (edad >= 0 && edad <= 5) {
            persona = "Es un bebe";
        } else if (edad >= 6 && edad <= 12) {
            persona = "Es un niño";
        } else if (edad >= 13 && edad <= 18) {
            persona = "Es un Adolecente";
        } else if (edad >= 19 && edad <= 25) {
            persona = "Es un Joven";
        } else if (edad >= 26 && edad <= 60) {
            persona = "Es un Adulto";
        } else if (edad >= 60) {
            persona = "Es un Adulto de la 3º edad";
        }
        return persona;
    }

    private String estadoDeSalud() {
        String Salud = null;
        if (temperatura <= 36.5) {
            Salud = "tiene Hipotermia";
        } else if (temperatura >= 36.6 && temperatura <= 37) {
            Salud = "esta Sano";
        } else if (temperatura >= 37.1 && temperatura <= 37.5) {
            Salud = "tiene Fiebre leve";
        } else if (temperatura >= 37.6) {
            Salud = "tiene Fiebre severa";
        }
        return Salud;
    }

}
