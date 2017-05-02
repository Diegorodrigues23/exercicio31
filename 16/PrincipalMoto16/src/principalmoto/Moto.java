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
    int menorMarcha;
    int maiorMarcha;
    boolean ligada;
    
    
    public void imprimir(){
        System.out.println("Os atributos da moto são");
        System.out.println("\nMarca: " + marca + "\nModelo: "+ modelo + "\nCor: " +cor +"\nMarcha: " + marcha + "\n A moto está Ligada: " + ligada);
        
    }

    void contrutor() {
        
        System.out.println("Informe a Marca da moto");
        marca = entrada.next();
        System.out.println("Informe a Cor da moto");
        cor = entrada.next();
        System.out.println("Informe a Modelo da moto");
        modelo = entrada.next();
        System.out.println("Informe a Maior marcha da moto");
        maiorMarcha = entrada.nextInt();
        System.out.println("Informe a Menor marcha da moto");
        menorMarcha = entrada.nextInt();
        
        System.out.println("Informe a Marcha atual da moto");
        marcha = entrada.nextInt();
        if (marcha > maiorMarcha) {
            System.out.println("marcha inválida");
            
        }
        if (marcha < menorMarcha) {
            System.out.println("Marcha inválida");
        }
        
        System.out.println("A moto está ligada");
        ligada = entrada.nextBoolean();
        
        
                
    }
    public void marchaAcima (){
     if (marcha<maiorMarcha){
     marcha = marcha + 1;}
     else {
         System.out.println("Marcha inválida");
     }
        
    }
    
    public void marchaAbaixo (){
        if(marcha>menorMarcha){
        marcha = marcha - 1;}
        else {
            System.out.println("Marcha inválida");
        }
        
    }
    
    public void ligar(){
        ligada = true;
    }
    
    public void desligar(){
        ligada = false;
    }
}
