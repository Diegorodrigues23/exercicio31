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
    boolean portaFechada;
    
    
    void construtor (){
        System.out.println("Informe se microondas está ligado? ");
        ligado = entrada.nextBoolean();
        System.out.println("Informe se microondas está com a porta fechada? ");
        portaFechada = entrada.nextBoolean();
         
    }
    public void ligar (){
        if (portaFechada == true){
        ligado = true;}
        else ligado = false;
    }
    public void desligar (){
        ligado = true;
    }
    public void abrirPorta (){
        portaFechada = false;
    }
    public void fecharPorta (){
        portaFechada = true;
    }
    
    
    public void imprimir(){
        
        System.out.println("O microondas está ligado " + ligado );
        System.out.println("O microondas está com a porta fechada " + portaFechada );
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
