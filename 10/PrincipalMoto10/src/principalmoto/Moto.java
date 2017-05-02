/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalmoto;

import java.util.Scanner;

/**
 *
 * @author SCD
 */
public class Moto {
    Scanner entrada = new Scanner(System.in);
    
    String marca;
    String modelo;
    String cor;
    int marcha;
    
    public void construtor(){
        System.out.println("Informe a Marca da Motocicleta");
        marca = entrada.next();
        System.out.println("Informe a Modelo da Motocicleta");
        modelo = entrada.next();
        System.out.println("Informe a Cor da Motocicleta");
        cor = entrada.next();
        System.out.println("Informe a Marcha da Motocicleta");
        marcha = entrada.nextInt();
        
        
        
    }
    public void imprimir(){
        System.out.println("Os atributos da moto são");
        System.out.println("\nMarca: " + marca + "\nModelo: "+ modelo + "\nCor: " +cor + "\nMarcha: " + marcha);
     
        }
        
    }

