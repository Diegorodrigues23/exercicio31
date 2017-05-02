/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;

/**
 *
 * @author SCD
 */
public class Circulo {
    
    float raio;
    float area;
    float perimetro;
    float pi;
    
    
    public void calcularArea (){
        area =  pi * raio * raio;
    }
    
    public void calcularPerimetro (){
    
        perimetro = 2 * pi * raio;
    
    }
    
    public void imprmir(){
        System.out.println("O cículo tem :" + "Raio: " + raio + " Perimetro: " + perimetro + " Área: " + area);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo c = new Circulo();
        
        c.raio = (float) 3;
        c.pi = (float) 3.141516;
        
        c.calcularArea();
        c.calcularPerimetro();
        c.imprmir();
        
    }
    
}
