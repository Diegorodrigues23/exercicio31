/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrado;

import java.util.Scanner;

/**
 *
 * @author SCD
 */
public class Quadrado {
    Scanner entrada = new Scanner(System.in);
    float lado;
    float area;
    float perimetro;
    
    public void calcularArea(){

        area = lado *lado;
}

    public void calcularPerimetro(){
        perimetro = 4*lado;
}

    public void imprimir(){
            System.out.println("Area: "+ area + "\nLado: " + lado +"\nPerimeto: "+perimetro);
        
    }
    
    public void construtor(){
        System.out.println("Informe o lado ");
        lado = entrada.nextFloat();
        
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
    }
    
}
