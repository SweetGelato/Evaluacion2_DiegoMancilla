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
public abstract class Contenido implements CostoSuscripcion{
    private String codigo;
    private String titulo;
    private int duracion_minutos;
    private int recomendable;

    public Contenido() {
    }

    public Contenido(String codigo, String titulo, int duracion_minutos, int recomendable) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracion_minutos = duracion_minutos;
        this.recomendable = recomendable;
        
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion_minutos() {
        return duracion_minutos;
    }

    public void setDuracion_minutos(int duracion_minutos) {
        this.duracion_minutos = duracion_minutos;
    }

    public int getRecomendable() {
        return recomendable;
    }

    public void setRecomendable(int recomendable) {
        this.recomendable = recomendable;
    }

    @Override
    public String toString() {
        return "Contenido{" + "codigo=" + codigo + ", titulo=" + titulo + ", duracion_minutos=" + duracion_minutos + ", recomendable=" + recomendable + '}';
    }

    public void detalles_contenido(){
        System.out.println("Codigo:" + codigo);
        System.out.println("Titulo:" + titulo);
        System.out.println("Duracion" + duracion_minutos);
        Random randit = new Random();
        int recomendable = randit.nextInt(2);
        if (recomendable == 0){
            System.out.println("Se recomienda el contenido al usuario");
        }else{
            System.out.println("El usuario no es compatible con el contenido");
        }

    }

    @Override
    public void costo_mensual() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
