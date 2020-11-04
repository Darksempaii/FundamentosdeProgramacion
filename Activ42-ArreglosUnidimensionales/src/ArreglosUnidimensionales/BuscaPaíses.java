
package ArreglosUnidimensionales;
import javax.swing.JOptionPane;

public class BuscaPaíses {

    public static void main(String[] args) {
        //Variables y array,s
        String[] paises = {"Mexico","España","Japon","Corea del sur","Rusia","China","Canada","Francia","India","Filipinas","alemania"};
        String nombre = JOptionPane.showInputDialog(null,"Inserta el nombre de un pais"," Buscador",JOptionPane.QUESTION_MESSAGE);
        int intento= 0;
        //se cuencia de busqueda
        for (int i = 0; i < paises.length; i++) {
           if (nombre.equalsIgnoreCase(paises[i])) {
                JOptionPane.showMessageDialog(null, "el pais "+paises[i]+" si existe en el indice","Pais encontrado", JOptionPane.INFORMATION_MESSAGE);
            }else{
            intento++;
            } 
        }
        //En caso de no existir en el indice
        if (intento >= paises.length) {
            JOptionPane.showMessageDialog(null, "el pais "+nombre+" no existe en el indice","Error", JOptionPane.WARNING_MESSAGE);
        }
        //salida
        System.exit(0);
    }
    
}
