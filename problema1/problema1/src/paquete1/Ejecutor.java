/*
*/
package paquete1;

import paquete2.LibretaNotas;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    public static void main(String[] args) {

        LibretaNotas libreta1 = new LibretaNotas("Hinata", 10,10,9);
        libreta1.obtenerPromedio();
        LibretaNotas libreta2 = new LibretaNotas("Hinata", 10, 10);
        libreta2.obtenerPromedio();
        System.out.printf("%s\n",libreta1);
        System.out.printf("%s\n",libreta2);
        
    }

}
