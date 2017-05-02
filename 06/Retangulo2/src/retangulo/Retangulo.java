/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retangulo;

import java.util.Scanner;

/**
 *
 * @author SCD
 */
public class Retangulo {
    Scanner entrada = new Scanner(System.in);
    float comprimento;
    float largura;
    float area;
    float perimetro;
    
     public void calcularArea(){

        area = comprimento * largura;
}

    public void calcularPerimetro(){
        perimetro = ((2*comprimento) + (2*largura));
}

    public void imprimir(){
            System.out.println("O Retângulo tem:" + "Area: "+ area + "\nComprimento: " + comprimento  +"\nPerimeto: "+perimetro + "\nLargura: " +largura);
    }
    
    public void construtor(){
        
        System.out.println("Informe o valor do comprimetno");
        comprimento = entrada.nextFloat();
        System.out.println("Informe o valor do largura");
        largura = entrada.nextFloat();
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Retangulo re = new Retangulo();
        
        re.construtor();
        re.calcularArea();
        re.calcularPerimetro();
        re.imprimir();
        
        
        
        
        
        
    }
    
}
