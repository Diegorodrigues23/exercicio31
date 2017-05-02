/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisor;

/**
 *
 * @author SCD
 */
public class Televisor {
    
    boolean ligado;
    int canal;
    int volume;
    
    public void imprimir(){
        System.out.println("\nA tv está ligado: " + ligado + "\nCanal: " + canal + "\nVolume: " + volume);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
