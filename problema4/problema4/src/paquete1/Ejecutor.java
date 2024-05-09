/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.Cheques;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    public static void main(String[] args) {
        Cheques cheque1 = new Cheques("Harry Potter", "Gringotts", 50625);
        cheque1.calcularComisionBanco();
        Cheques cheque2 = new Cheques("Hermione Granger", "Gringotts");
        cheque2.calcularComisionBanco();
        System.out.printf("%s\n", cheque1);
        System.out.printf("%s\n", cheque2);
    }

}
