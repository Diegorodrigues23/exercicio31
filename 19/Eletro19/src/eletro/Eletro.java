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
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        eletrodomestico el = new eletrodomestico();
        
        el.construtor();
        el.desligar();
        el.imprmir();
    }
    
}
