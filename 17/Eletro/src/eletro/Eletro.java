/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eletro;

/**
 *
 * @author SCD
 */
public class Eletro {
    boolean ligado;
    
    public void imprmir(){
        if (ligado == true){
            System.out.println("Ligado");
        }
        if (ligado == false) {
            System.out.println("Desligado");
             
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Eletro el = new Eletro();
        el.ligado = true;
        el.imprmir();
    }
    
}
