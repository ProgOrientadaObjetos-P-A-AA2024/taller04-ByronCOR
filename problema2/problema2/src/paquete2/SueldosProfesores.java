/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author utpl
 */
public class SueldosProfesores {

    private String nombre;
    private String apellido;
    private int cedula;
    private double sueldoBasico;
    private double sueldoTotal;

    public SueldosProfesores(String n, String a, int c, double sb) {
        nombre = n;
        apellido = a;
        cedula = c;
        sueldoBasico = sb;

    }

    public SueldosProfesores(String n, String a, int c) {
        nombre = n;
        apellido = a;
        cedula = c;
        sueldoBasico = 1654;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerCedula(int c) {
        cedula = c;
    }

    public void establecerSueldoBasico(double sb) {
        sueldoBasico = sb;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public int obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    // el metodo to Strin la representacion  del objeto
    @Override
    public String toString() {
        String cadena = String.format("\nSueldo del Profesor\n"
                + "Profesor:%s %s\n"
                + "Cedula:%d\n"
                + "Sueldo Basico:%.2f\n"
                + "Sueldo Total:%.2f\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerCedula(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal());
        return cadena;
    }
}
