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
    Scanner entrada =  new Scanner(System.in);
    String marca;
    String modelo;
    String cor;
    int marcha;
    
    
    public void imprimir(){
        System.out.println("Os atributos da moto são");
        System.out.println("\nMarca: " + marca + "\nModelo: "+ modelo + "\nCor: " +cor +"Marcha: " + marcha);
        
    }

    void contrutor() {
        System.out.println("Informe a Cor da moto");
        cor = entrada.next();
        System.out.println("Informe a Modelo da moto");
        modelo = entrada.next();
        System.out.println("Informe a Marca da moto");
        marca = entrada.next();
        System.out.println("Informe a Marcha da moto");
        marcha = entrada.nextInt();
                
    }
    public void marchaAcima (){
        marcha = marcha + 1;
    }
    
    public void marchaAbaixo (){
        marcha = marcha - 1;
    }
    
}
