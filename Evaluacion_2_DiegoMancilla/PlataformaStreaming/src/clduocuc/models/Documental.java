/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clduocuc.models;

/**
 *
 * @author Cetecom
 */
public class Documental extends Contenido {
    private String enfoque_educativo;

    public Documental() {
    }

    public Documental(String enfoque_educativo) {
        this.enfoque_educativo = enfoque_educativo;
    }

    public Documental(String enfoque_educativo, String codigo, String titulo, int duracion_minutos, int recomendable) {
        super(codigo, titulo, duracion_minutos, recomendable);
        this.enfoque_educativo = enfoque_educativo;
    }

    public String getEnfoque_educativo() {
        return enfoque_educativo;
    }

    public void setEnfoque_educativo(String enfoque_educativo) {
        this.enfoque_educativo = enfoque_educativo;
    }

    @Override
    public String toString() {
        return "Documental{" + "enfoque_educativo=" + enfoque_educativo + '}';
    }
    
    public void costo_mensual(){
        double costo_base = 12000;
        if(super.getDuracion_minutos() > 90){
            costo_base = costo_base * 1.05;
            System.out.println("El costo es :" + costo_base);
        }else{
            System.out.println("El costo es:" + costo_base);
        }
}
    public void detalle_documental(){
        super.detalles_contenido();
        System.out.println("Enfoque: " + enfoque_educativo);
        costo_mensual();
    }
}
