/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clduocuc.models;

import java.util.Random;

/**
 *
 * @author Cetecom
 */
public class Serie extends Contenido {
    private int temporadas, finalizada;

    public Serie() {
    }

    public Serie(int temporadas, int finalizada) {
        this.temporadas = temporadas;
        this.finalizada = finalizada;
    }

    public Serie(int temporadas, int finalizada, String codigo, String titulo, int duracion_minutos, int recomendable) {
        super(codigo, titulo, duracion_minutos, recomendable);
        this.temporadas = temporadas;
        this.finalizada = finalizada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(int finalizada) {
        this.finalizada = finalizada;
    }

    @Override
    public String toString() {
        return "Serie{" + "temporadas=" + temporadas + ", finalizada=" + finalizada + '}';
    }
    
    public void costo_mensual(){
        double costo_base = 12000;
        if(temporadas > 3){
            costo_base = costo_base * 1.08;
            System.out.println("El costo es :" + costo_base);
        }else{
            System.out.println("El costo es:" + costo_base);
        }
}
    public void detalle_serie(){
        super.detalles_contenido();
        System.out.println("Temporadas: " + temporadas);
        Random randit = new Random();
        int recomendable = randit.nextInt(2);
        if (recomendable == 0){
            System.out.println("La serie ya finalizo");
        }else{
            System.out.println("La serie aun no finaliza");
        costo_mensual();
    }
}
}