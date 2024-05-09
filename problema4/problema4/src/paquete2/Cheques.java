/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

public class Cheques {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public Cheques(String nc, String nb, double v) {
                nombreCliente = nc;
                nombreBanco = nb;
                valorCheque = v;
    }

    public Cheques(String nc, String nb) {
                nombreCliente = nc;
                nombreBanco = nb;
                valorCheque = 645;
    }

    public void establecerNombreCliente(String nc) {
        nombreCliente = nc;
    }

    public void establecerNombreBanco(String nb) {
        nombreBanco = nb;
    }

    public void establecerValorCheque(double v) {
        valorCheque = v;
    }

    public void calcularComisionBanco() {
        comisionBanco = valorCheque * 0.00003;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComisionBanco() {
        return comisionBanco;
    }

    // el metodo to Strin la representacion  del objeto
    @Override
    public String toString() {
        String cadena = String.format("\nEntidad Financiera\n"
                + "Nombre del Cliente:%s\n"
                + "Nombre del Banco:%s\n"
                + "Valor del Cheque:%.2f galeones\n"
                + "Comisión del Banco:%.2f galeones\n",
                obtenerNombreCliente(),
                obtenerNombreBanco(),
                obtenerValorCheque(),
                obtenerComisionBanco());
        return cadena;
    }
}
