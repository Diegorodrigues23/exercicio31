/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microondas;

import java.util.Scanner;



/**
 *
 * @author SCD
 */
public class Microondas {
    Scanner entrada =  new Scanner(System.in);
    boolean ligado;
    
    
    void construtor (){
        System.out.println("Informe se microondas está ligado? ");
        ligado = entrada.nextBoolean();
         
    }
    public void ligar (){
        ligado = true;
    }
    public void desligar (){
        ligado = true;
    }
    
    
    public void imprimir(){
        
        System.out.println("O microondas está ligado " + ligado );
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
