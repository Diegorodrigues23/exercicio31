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
    int numeroCanais;
    int volumeMaximo;
    
    public void imprimir(){
        System.out.println("\nA tv está ligado: " + ligado + "\nCanal: " + canal + "\nVolume: " + volume + "\nNumero de canais: "+numeroCanais + "\nVolume Máximos" +volumeMaximo);
    }
    
    void construtor(){
        System.out.println("Informe se a TV está ligado! ");
        ligado = entrada.nextBoolean();
        System.out.println("Informe o canal ");
        canal = entrada.nextInt();
        System.out.println("Informe o volume ");
        volume = entrada.nextInt();
        System.out.println("Informe o Numero de Canais Máximo ");
        numeroCanais = entrada.nextInt();
        System.out.println("Informe o volume Maximo ");
        volumeMaximo = entrada.nextInt();
        
        
    }
    public void ligar (){
        ligado = true;
    }
    
    public void desligar (){
        ligado = false;
    }
    public void canalAbaixo (){
        if (canal == 1){
            canal = numeroCanais;
        }
        else canal = canal - 1;
    }
    public void canalAcima (){
        canal = canal + 1;
    }
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
