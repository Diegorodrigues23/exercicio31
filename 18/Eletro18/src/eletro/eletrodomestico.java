/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eletro;

import java.util.Scanner;

/**
 *
 * @author SCD
 */
public class eletrodomestico {
     Scanner entrada = new Scanner(System.in);
     boolean ligado;
    
    public void imprmir(){
        if (ligado == true){
            System.out.println("Ligado");
        }
        if (ligado == false) {
            System.out.println("Desligado");
             
        }
    }
    void construtor(){
        System.out.println("Infome se o Eletrodoméstico está ligado");
        ligado = entrada.nextBoolean();
        
    } 
    
}