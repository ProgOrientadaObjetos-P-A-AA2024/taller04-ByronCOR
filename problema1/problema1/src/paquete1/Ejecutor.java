/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
        libreta1.calcularPromedio();
        LibretaNotas libreta2 = new LibretaNotas("Hinata", 10, 10);
        libreta2.calcularPromedio();
        System.out.printf("%s\n%s\n",libreta1,libreta2);
    }

}
