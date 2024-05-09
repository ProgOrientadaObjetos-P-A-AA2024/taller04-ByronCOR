/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.Vehiculos;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    public static void main(String[] args) {
        Vehiculos auto1 = new Vehiculos("Toyota", 1104563890, 2018, 15000);
        auto1.calcularValorMatricula();
        Vehiculos auto2 = new Vehiculos("Honda", 1104567830, 2020);
        auto2.calcularValorMatricula();
        System.out.printf("%s\n", auto1);
        System.out.printf("%s\n", auto2);
    }

}
