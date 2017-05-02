/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisor;

import java.util.Scanner;

/**
 *
 * @author SCD
 */
public class Televisor {
    Scanner entrada = new Scanner(System.in);
    boolean ligado;
    int canal;
    int volume;
    
    public void imprimir(){
        System.out.println("\nA tv está ligado: " + ligado + "\nCanal: " + canal + "\nVolume: " + volume);
    }
    
    void construtor(){
        System.out.println("Informe se a TV está ligado! ");
        ligado = entrada.nextBoolean();
        System.out.println("Informe o canal ");
        canal = entrada.nextInt();
        System.out.println("Informe o volume ");
        volume = entrada.nextInt();
        
    }
    public void ligar (){
        ligado = true;
    }
    
    public void desligar (){
        ligado = false;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
