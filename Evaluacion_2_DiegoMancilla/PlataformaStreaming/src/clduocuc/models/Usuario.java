/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clduocuc.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Usuario {
    private String nombre;
    private List <Contenido> contenido_visto = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Contenido> getContenido_visto() {
        return contenido_visto;
    }

    public void setContenido_visto(List<Contenido> contenido_visto) {
        this.contenido_visto = contenido_visto;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", contenido_visto=" + contenido_visto + '}';
    }

    
}
