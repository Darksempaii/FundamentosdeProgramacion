package Programa_Triángulo;

public class Triangulo {

    private int Altura;
    private int Base;


    public Triangulo(int Base, int Altura) {//metodo constructor 
        this.Altura = Altura;
        this.Base = Base;
    }

    private String dibujaTriangulo() { //dibujar cuadrado
        String[][] Triangulo = new String[Altura][Base];
        for (int i = 0; i < Triangulo.length; i++) {
            for (int j = 0; j < Triangulo[i].length; j++) {
                if (i >= j) {
                    Triangulo[i][j]="* ";
                }else{
                    Triangulo[i][j]="  ";
                }
            }
        }
        String render = "";
        for (int i = 0; i < Triangulo.length; i++) {
            for (int j = 0; j < Triangulo[i].length; j++) {
                render = render + Triangulo[i][j];
            }
            render = render + "\n";
        }
        return render;
    }

    private int calcularArea() { //Area del cuadrado
        int area;
        area = (Base * Altura) / 2;
        return area;
    }

    private int calculaPerimetro() {//Perimetro del Cuadrado
        int perimetro;
        perimetro = Base * 3;
        return perimetro;
    }

    public String toString() { //metodo que regresa las variables
        
        return dibujaTriangulo()+"\nBase es de "+Base+" y su Altura es de "+Altura+"\nEl perimetro es de "+calculaPerimetro()+" y su Area es de "+calcularArea();    
    }
}
