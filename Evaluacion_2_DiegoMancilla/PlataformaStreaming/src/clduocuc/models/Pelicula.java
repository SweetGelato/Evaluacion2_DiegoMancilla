/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clduocuc.models;

/**
 *
 * @author Cetecom
 */
public class Pelicula extends Contenido{
    private double calificacion;

    public Pelicula() {
    }

    public Pelicula(double calificacion) {
        this.calificacion = calificacion;
    }

    public Pelicula(double calificacion, String codigo, String titulo, int duracion_minutos, int recomendable) {
        super(codigo, titulo, duracion_minutos, recomendable);
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    @Override
    public String toString() {
        return "Pelicula{" + "calificacion=" + calificacion + '}';
    }
    public void costo_mensual(){
        double costo_base = 12000;
        if(calificacion > 4.5){
            costo_base = costo_base * 1.10;
            System.out.println("El costo es :" + costo_base);
        }else{
            System.out.println("El costo es:" + costo_base);
        }
    }
    public void detalle_pelicula(){
        super.detalles_contenido();
        System.out.println("Calificacion: " + calificacion);
        costo_mensual();
    }
}
