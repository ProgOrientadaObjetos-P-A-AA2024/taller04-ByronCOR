/*
*/
package paquete1;

import paquete2.SueldosProfesores;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    public static void main(String[] args) {

        SueldosProfesores sueldo1 = new SueldosProfesores("Kakashi", "Hatake",1105682545,859);
        sueldo1.calcularSueldoTotal();
        SueldosProfesores sueldo2 = new SueldosProfesores("Tsunade","Senju", 1105874315);
        sueldo2.calcularSueldoTotal();
        System.out.printf("%s\n",sueldo1);
        System.out.printf("%s\n",sueldo2);
        
    }

}
