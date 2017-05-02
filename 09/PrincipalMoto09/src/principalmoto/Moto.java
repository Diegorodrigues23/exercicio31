/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalmoto;

/**
 *
 * @author SCD
 */
public class Moto {
    
    String marca;
    String modelo;
    String cor;
    int marcha;
    
    
    public void imprimir(){
        System.out.println("Os atributos da moto são");
        System.out.println("\nMarca: " + marca + "\nModelo: "+ modelo + "\nCor: " +cor);
        if (marcha == 1){
            System.out.println("A moto está: " + marcha + "Marcha");
        if (marcha == 2){
            System.out.println("A moto está: " + marcha + "Marcha");    
        if (marcha == 0){
            System.out.println("A moto está em neutro");
        }
        else{
            System.out.println("Marcha não existe");
                    }
        }
        }
        
    }
}
