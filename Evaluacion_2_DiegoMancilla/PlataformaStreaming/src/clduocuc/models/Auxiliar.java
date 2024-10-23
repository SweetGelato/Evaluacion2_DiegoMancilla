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
public class Auxiliar extends Contenido{
    private List <Contenido> contenido_visto = new ArrayList<>();
    private List <Usuario> usuarios = new ArrayList<>();

    public Auxiliar() {
    }
    
    public void agregar_contenido(String nombre){
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        while(opcion != 0){
            System.out.println("1)Agregar Pelicula");
            System.out.println("2)Agregar Serie");
            System.out.println("3)Agregar Documental");
            System.out.println("4)Salir");

            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    Pelicula nueva_pelicula = new Pelicula();
                        contenido_visto.add(nueva_pelicula);
                        System.out.println("Pelicula Agregada");
                case 2:
                    Serie nueva_serie = new Serie();
                        contenido_visto.add(nueva_serie);
                        System.out.println("Serie Agregada");
                case 3:
                    Documental nueva_documental = new Documental();
                        contenido_visto.add(nueva_documental);
                        System.out.println("Documental Agregada");
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    }
            }
        }
    public void agregar_usuario(int id){
        Usuario nuevo_usuario = new Usuario();
        usuarios.add(nuevo_usuario);
        System.out.println("Usuario Agregado");
    }
    public void Listar_usuario(){
        for(Usuario i: usuarios){
            System.out.println("Los usuarios son:" + i);
        }
    }
    public void Listar_contenido(){
        for(Contenido i: contenido_visto){
            System.out.println("El contenido disponible es: " + i);
        }
        }
    }
    
    


