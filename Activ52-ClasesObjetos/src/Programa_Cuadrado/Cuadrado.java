package Programa_Cuadrado;

public class Cuadrado {

    private int lado;

    public Cuadrado(int cara) {//metodo constructor
        this.lado = cara;
    }

    public String dibujaCuadro() { //dibujar cuadrado
        String[][] cuadro = new String[lado][lado];
        for (int i = 0; i < cuadro.length; i++) {
            for (int j = 0; j < cuadro[i].length; j++) {
                cuadro[i][j] = "* ";
            }
        }
        String render = "";
        for (int i = 0; i < cuadro.length; i++) {
            for (int j = 0; j < cuadro.length; j++) {
                render = render + cuadro[i][j]; 
            }
            render = render + "\n";
        }
        return render;
    }
    
    public int calcularArea(){ //Area del cuadrado
        int area = 0;
        area = lado*lado;
        return area;
    }
    
    public int calculaPerimetro(){//Perimetro del Cuadrado
        int perimetro = 0;
        perimetro = lado * 4;
        return perimetro;
    }
    
    public String toString() { //metodo que regresa las variables
        
        
        return dibujaCuadro()+"Cuadrado de "+lado+" por lado";
    }

}
