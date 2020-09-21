/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darksempaii.fprogramacion25;

/**
 *
 * @author Darksempaii
 */
public class Tabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cabecera = "\n\tPRONOSTICO DE CLIMA:\n";
        cabecera += "\n\tDia\t\tMañana\tNoche\tCondiciones\n";
        cabecera += "\t---\t\t-------\t----\t-----------\n";

        String pronostico = "\tDomingo\t\t25C\t23C\tSoleado\n";
        pronostico += "\tLunes\t\t32C\t22C\tSoleado\n";
        pronostico += "\tMartes\t\t20C\t15C\tNublado\n";
        pronostico += "\tJuevez\t\t29C\t20C\tparcialmente soleado\n";
        pronostico += "\tMartes\t\t25C\t18C\tDespejado\n";

        System.out.print(cabecera + pronostico);
    }

}
