/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retangulo;

/**
 *
 * @author SCD
 */
public class Retangulo {
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
            System.out.println("Area: "+ area + "\nComprimento: " + comprimento  +"\nPerimeto: "+perimetro + "\nLargura: " +largura);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Retangulo re = new Retangulo();
        
        re.largura = (float) 8.5;
        re.comprimento = 2;
        
        re. calcularArea();
        re.calcularPerimetro();
        re.imprimir();
        
        
        
        
        
        
    }
    
}
