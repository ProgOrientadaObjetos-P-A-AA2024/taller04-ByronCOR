/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author utpl
 */
public class LibretaNotas {
        private String nombreEstudiante;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public LibretaNotas(String n, double c1, double c2, double c3) {
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }
        public LibretaNotas(String n, double c1, double c2) {
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = 10;
    }

    public void establecerNombreEstudiante(String c) {
        nombreEstudiante = c;
    }

    public void establecerCalificacion1(double d) {
        calificacion1 = d;
    }

    public void establecerCalificacion2(double d) {
        calificacion2 = d;
    }

    public void establecerCalificacion3(double d) {
        calificacion3 = d;
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    // el metodo to Strin la representacion  del objeto
    @Override
    public String toString() {
        String cadena = String.format("\n\nLibreta de notas\n"
                + "Nombre Estudiante:%s\n"
                + "Calificacion1:%2.f\n"
                + "Calificacion2:%2.f\n"
                + "Calificacion3:%2.f\n"
                + "Promedio:%2.f\n",
                 nombreEstudiante,
                 obtenerCalificacion1(),
                 obtenerCalificacion2(),
                 obtenerCalificacion3(),
                 obtenerPromedio());
        return cadena;
    }
}
