/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plataformastreaming;

import clduocuc.models.Auxiliar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class PlataformaStreaming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        aux.agregar_contenido("Pinocho");
        aux.agregar_contenido("Midsomar");
        aux.agregar_contenido("Holyday");
        aux.agregar_contenido("The boyz");
        aux.agregar_contenido("Sopranos");
        aux.agregar_contenido("Fauna chilena");
        aux.agregar_contenido("colonias de hormigas");

        aux.agregar_usuario(1);
        aux.agregar_usuario(2);
        aux.agregar_usuario(3);
        aux.agregar_usuario(4);
        aux.agregar_usuario(5);
        
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        while(opcion != 0){
            System.out.println("Menu");
            System.out.println("1)Ver usuarios");
            System.out.println("2)Ver catalogo");
            System.out.println("3)Ver costos");
            System.out.println("4)Salir");

            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    aux.Listar_usuario();
                case 2:
                    aux.Listar_contenido();
                case 3:
                    
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    }
            }
        }
    }
    

