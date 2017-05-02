/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrado;

/**
 *
 * @author SCD
 */
public class Quadrado {
    
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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
    }
    
}
